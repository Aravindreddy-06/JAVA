import java.util.*;

public class Average{
    public static double Avg(double a, double b){
        double ans = (a + b)/2;
        return ans;
    }

    public static void main(String args[]){
        double result = Avg(19,4);
        System.out.print(result);
    }
}