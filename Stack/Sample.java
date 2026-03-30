import java.util.*;

public class Sample{
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        while(!s.isEmpty()){
            System.out.print(s.pop() + " ");
        }
    }
}