//Sort List of strings using Lambda.

import java.util.*;

public class p07{
    public static void main(String args[]){
        List<String> list = Arrays.asList("Alice", "Bob", "Charlie", "Adam");

        /*
        "Bob".compareTo("Alice")
        Compare first letters:

        'B' (66) vs 'A' (65)

        66 - 65 = +1 (positive)
        So "Alice" comes before "Bob"
        */
        list.sort((a,b) -> a.compareTo(b));

        System.out.println(list);
    }
}