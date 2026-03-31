//Lambda Function with single parameter

import java.util.*;

public class p04{
    public static void main(String args[]){
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.print("All Elements: ");
        list.forEach(n -> System.out.print(n + " "));

        System.out.print("\nEven Elements: ");
        list.forEach(n -> {if(n%2 == 0)System.out.print(n + " ");});
    }
}