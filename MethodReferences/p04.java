// 3. Reference to an Instance Method of an Arbitrary Object

import java.util.*;

class p04{
    
    public static void main(String[] args){

        List<String> names = Arrays.asList("java", "spring", "microservice");

        names.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);
    }
}