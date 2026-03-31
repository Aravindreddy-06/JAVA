//Lambda Function with zero parameter

interface ZeroParameter{
    void display();
    
}

public class p03{
    public static void main(String args[]){
        ZeroParameter fobj = () -> System.out.println("This is a zero-parameter lambda Expression.");
        fobj.display();
    }
}