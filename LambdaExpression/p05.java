//Lambda Function with multiple parameter

@FunctionalInterface
interface Functional{
    int operation(int a, int b);
}

public class p05{
    public static void main(String args[]){
        Functional add = (a,b) -> a+b;
        Functional mul = (a,b) -> a*b;

        System.out.println(add.operation(2,5));
        System.out.println(mul.operation(2,5));
    }
}