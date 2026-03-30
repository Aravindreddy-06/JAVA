interface test{
    final int a = 10;

    void display();
}

class Testclass implements test{
    public void display(){
        System.out.println("Apple");
    }
}
public class SampleCode{
    public static void main(String args[]){
        Testclass t = new Testclass();
        t.display();
        System.out.println(t.a);
    }
}