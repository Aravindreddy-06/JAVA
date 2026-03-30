class Student{
    private String name;    //data hidden

    void setName(String name){  //setter Method
        this.name = name;
    }
    String getName(){           //getter Method
        return name;
    }
}

public class SampleCode{
    public static void main(String args[]){
        Student s = new Student();

        s.setName("Aravind");           //setting value
        System.out.println(s.getName());//getting value
    }
}