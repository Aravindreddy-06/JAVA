import java.util.*;

public class Basic{
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("DSA");
        list.add("C++");

        for(String s : list){
            System.out.println(s);
        }
    }
}