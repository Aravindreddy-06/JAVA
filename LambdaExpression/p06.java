import java.util.*;

public class p06{
    public static void main(String args[]){
        List<String> list = Arrays.asList("Alice", "Bob", "Charlie", "Adam");

        System.out.println("All Names: ");
        list.forEach(name -> System.out.println(name));

        System.out.println("\nNames Starting with 'A': ");
        list.stream().filter(n -> n.startsWith("A")).map(n -> n.toUpperCase()).forEach(System.out::println);
    }
}