import java.io.*;

public class p03{
    public static void main(String args[]){
        try{
            FileWriter writer = new FileWriter("students.txt");

            writer.write("1. Aravind, CSE, 8.5 CGPA\n");
            writer.write("2. Rahul, ECE, 7.8 CGPA\n");
            writer.write("3. Sneha, IT, 9.1 CGPA\n");
            writer.write("4. Kiran, MECH, 6.9 CGPA\n");
            writer.write("5. Priya, CSE, 8.8 CGPA\n");
            writer.write("6. Vikas, CIVIL, 7.2 CGPA\n");
            writer.write("7. Anjali, EEE, 8.0 CGPA\n");
            writer.write("8. Rohit, IT, 7.5 CGPA\n");
            writer.write("9. Meena, CSE, 9.3 CGPA\n");
            writer.write("10. Suresh, MECH, 6.8 CGPA\n");

            writer.close();
            System.out.println("Student data written successfully.");
        }catch(IOException e){
            System.out.println("An error Occured.");
        }
    }
}