final class Student{
    private int id;
    private String name;
    private String address;
    
    public Student setId(int id){
        this.id = id;
        return this;
    }
    public Student setName(String name){
        this.name = name;
        return this;
    }
    public Student setAddress(String address){
        this.address = address;
        return this;
    }
    @Override
    public String toString(){
        return "id=" + this.id + ", name=" + this.name + ", address=" + this.address;
    }
}

public class Main{
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();
        
        s1.setId(1).setName("Ram").setAddress("Noida");
        s2.setId(2).setName("Shyam").setAddress("Delhi");
        
        System.out.println(s1);
        System.out.println(s2);
    }
}