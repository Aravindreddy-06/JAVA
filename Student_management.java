package com.sms.dao;

import com.sms.db.DatabaseConnection;
import com.sms.model.Student;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Data Access Object for Student — full CRUD + search/filter operations.
 */
public class Student_management {

    private Connection conn() throws SQLException, IOException {
        return DatabaseConnection.getInstance().getConnection();
    }

    // ─────────────────────────── Schema ───────────────────────────

    /**
     * Creates the students table if it does not already exist.
     * Compatible with both MySQL and PostgreSQL.
     */
    public void createTableIfNotExists() throws SQLException, IOException {
        String sql = """
                CREATE TABLE IF NOT EXISTS students (
                    id           SERIAL PRIMARY KEY,
                    student_code VARCHAR(20)  NOT NULL UNIQUE,
                    first_name   VARCHAR(100) NOT NULL,
                    last_name    VARCHAR(100) NOT NULL,
                    year         INT          NOT NULL CHECK (year BETWEEN 1 AND 4),
                    subject      VARCHAR(100) NOT NULL,
                    score        INT          NOT NULL CHECK (score BETWEEN 0 AND 100),
                    status       VARCHAR(20)  NOT NULL DEFAULT 'active',
                    created_at   TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
                    updated_at   TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP
                )
                """;
        // MySQL uses AUTO_INCREMENT instead of SERIAL
        String dbUrl = conn().getMetaData().getURL();
        if (dbUrl.contains("mysql")) {
            sql = sql.replace("SERIAL PRIMARY KEY",
                              "INT NOT NULL AUTO_INCREMENT PRIMARY KEY");
        }
        try (Statement stmt = conn().createStatement()) {
            stmt.executeUpdate(sql);
            System.out.println("Table 'students' ready.");
        }
    }

    // ─────────────────────────── Create ───────────────────────────

    /**
     * Inserts a new student and returns the generated ID.
     */
    public int create(Student s) throws SQLException, IOException {
        String sql = """
                INSERT INTO students
                    (student_code, first_name, last_name, year, subject, score, status)
                VALUES (?, ?, ?, ?, ?, ?, ?)
                """;
        try (PreparedStatement ps = conn().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, s.getStudentCode());
            ps.setString(2, s.getFirstName());
            ps.setString(3, s.getLastName());
            ps.setInt(4, s.getYear());
            ps.setString(5, s.getSubject());
            ps.setInt(6, s.getScore());
            ps.setString(7, s.getStatus());
            ps.executeUpdate();

            try (ResultSet keys = ps.getGeneratedKeys()) {
                if (keys.next()) {
                    int generatedId = keys.getInt(1);
                    s.setId(generatedId);
                    return generatedId;
                }
            }
        }
        throw new SQLException("Insert failed: no generated key returned.");
    }

    // ─────────────────────────── Read ─────────────────────────────

    public List<Student> findAll() throws SQLException, IOException {
        return query("SELECT * FROM students ORDER BY id ASC");
    }

    public Optional<Student> findById(int id) throws SQLException, IOException {
        String sql = "SELECT * FROM students WHERE id = ?";
        try (PreparedStatement ps = conn().prepareStatement(sql)) {
            ps.setInt(1, id);
            List<Student> result = mapResult(ps.executeQuery());
            return result.isEmpty() ? Optional.empty() : Optional.of(result.get(0));
        }
    }

    public Optional<Student> findByCode(String code) throws SQLException, IOException {
        String sql = "SELECT * FROM students WHERE student_code = ?";
        try (PreparedStatement ps = conn().prepareStatement(sql)) {
            ps.setString(1, code);
            List<Student> result = mapResult(ps.executeQuery());
            return result.isEmpty() ? Optional.empty() : Optional.of(result.get(0));
        }
    }

    /**
     * Search by partial name, student code, or subject (case-insensitive).
     */
    public List<Student> search(String keyword) throws SQLException, IOException {
        String sql = """
                SELECT * FROM students
                WHERE LOWER(first_name)   LIKE LOWER(?)
                   OR LOWER(last_name)    LIKE LOWER(?)
                   OR LOWER(student_code) LIKE LOWER(?)
                   OR LOWER(subject)      LIKE LOWER(?)
                ORDER BY id ASC
                """;
        String like = "%" + keyword + "%";
        try (PreparedStatement ps = conn().prepareStatement(sql)) {
            for (int i = 1; i <= 4; i++) ps.setString(i, like);
            return mapResult(ps.executeQuery());
        }
    }

    /**
     * Filter by year and/or grade (pass null to skip a filter).
     */
    public List<Student> filter(Integer year, String grade) throws SQLException, IOException {
        StringBuilder sql = new StringBuilder("SELECT * FROM students WHERE 1=1");
        List<Object> params = new ArrayList<>();

        if (year != null) {
            sql.append(" AND year = ?");
            params.add(year);
        }
        if (grade != null) {
            switch (grade.toUpperCase()) {
                case "A" -> { sql.append(" AND score >= 85"); }
                case "B" -> { sql.append(" AND score >= 70 AND score < 85"); }
                case "C" -> { sql.append(" AND score >= 50 AND score < 70"); }
                case "F" -> { sql.append(" AND score < 50"); }
            }
        }
        sql.append(" ORDER BY id ASC");

        try (PreparedStatement ps = conn().prepareStatement(sql.toString())) {
            for (int i = 0; i < params.size(); i++) {
                ps.setObject(i + 1, params.get(i));
            }
            return mapResult(ps.executeQuery());
        }
    }

    // ─────────────────────────── Update ───────────────────────────

    /**
     * Updates all fields of an existing student by ID.
     * Returns true if a row was updated.
     */
    public boolean update(Student s) throws SQLException, IOException {
        String sql = """
                UPDATE students
                SET student_code = ?,
                    first_name   = ?,
                    last_name    = ?,
                    year         = ?,
                    subject      = ?,
                    score        = ?,
                    status       = ?,
                    updated_at   = CURRENT_TIMESTAMP
                WHERE id = ?
                """;
        try (PreparedStatement ps = conn().prepareStatement(sql)) {
            ps.setString(1, s.getStudentCode());
            ps.setString(2, s.getFirstName());
            ps.setString(3, s.getLastName());
            ps.setInt(4, s.getYear());
            ps.setString(5, s.getSubject());
            ps.setInt(6, s.getScore());
            ps.setString(7, s.getStatus());
            ps.setInt(8, s.getId());
            return ps.executeUpdate() > 0;
        }
    }

    // ─────────────────────────── Delete ───────────────────────────

    /**
     * Deletes a student by ID. Returns true if deleted.
     */
    public boolean deleteById(int id) throws SQLException, IOException {
        String sql = "DELETE FROM students WHERE id = ?";
        try (PreparedStatement ps = conn().prepareStatement(sql)) {
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        }
    }

    /**
     * Deletes all students (use with caution).
     */
    public int deleteAll() throws SQLException, IOException {
        try (Statement stmt = conn().createStatement()) {
            return stmt.executeUpdate("DELETE FROM students");
        }
    }

    // ─────────────────────────── Stats ────────────────────────────

    public int count() throws SQLException, IOException {
        try (Statement stmt = conn().createStatement();
             ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM students")) {
            return rs.next() ? rs.getInt(1) : 0;
        }
    }

    public double averageScore() throws SQLException, IOException {
        try (Statement stmt = conn().createStatement();
             ResultSet rs = stmt.executeQuery("SELECT AVG(score) FROM students")) {
            return rs.next() ? rs.getDouble(1) : 0.0;
        }
    }

    public List<Student> atRisk() throws SQLException, IOException {
        return query("SELECT * FROM students WHERE score < 50 ORDER BY score ASC");
    }

    // ─────────────────────────── Helpers ──────────────────────────

    private List<Student> query(String sql) throws SQLException, IOException {
        try (Statement stmt = conn().createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            return mapResult(rs);
        }
    }

    private List<Student> mapResult(ResultSet rs) throws SQLException {
        List<Student> list = new ArrayList<>();
        while (rs.next()) {
            Student s = new Student();
            s.setId(rs.getInt("id"));
            s.setStudentCode(rs.getString("student_code"));
            s.setFirstName(rs.getString("first_name"));
            s.setLastName(rs.getString("last_name"));
            s.setYear(rs.getInt("year"));
            s.setSubject(rs.getString("subject"));
            s.setScore(rs.getInt("score"));
            s.setStatus(rs.getString("status"));
            list.add(s);
        }
        return list;
    }
}