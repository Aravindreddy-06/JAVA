interface FuncInterface{
    void abstractFunc(int x);
    default void normalFunc(){
        System.out.println("Hello");
    }
}

public class p02{
    public static void main(String args[]){
        FuncInterface fobj = (int x) -> System.out.println(2*x);
        fobj.abstractFunc(5);
    }
}