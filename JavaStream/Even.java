import java.util.*;
import java.util.stream.*;

public class Even {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 15, 20, 25, 30, 33);

        List<Integer> evenNumbers = list.stream()
                                        .filter(n -> n % 2 == 0)
                                        .collect(Collectors.toList());

        System.out.println(evenNumbers);
    }
}