import java.util.*;

public class NoParameterWithReturn{
    public static int[] aravind(){
        
        int a = 10;
        int b = 20;

        int temp = a;
        a = b;
        b = temp;

        return new int[]{a,b};
    }
    public static void main(String args[]){
        int result[] = aravind();
        System.out.print(result[0] + " " + result[1]);
    }
}