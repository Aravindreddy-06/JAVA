import java.util.*;

public class p01{
    public static void print(String s){
        System.out.println(s);
    }
    public static void main(String args[]){
        String names[] = {"Aravind", "Kumar", "Reddy"};
        Arrays.stream(names).forEach(p01 :: print);
    }
}