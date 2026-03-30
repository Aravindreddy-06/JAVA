import java.util.*;

public class NoParameterNoReturn{
    public static void aravind(){
        
        int a = 10;
        int b = 20;

        int temp = a;
        a = b;
        b = temp;

        System.out.print(a + " " + b);
    }
    public static void main(String args[]){
        aravind();
    }
}