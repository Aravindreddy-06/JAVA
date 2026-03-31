// 2. Reference to an Instance Method of a Particular Object

import java.util.*;

class Printer{
    void print(String msg) {
        System.out.println(msg);
    }
}

class p03{
    public static void main(String[] args) {

        Printer printer = new Printer();
        List<String> data = Arrays.asList("Java", "Spring", "Boot");

        data.forEach(printer::print);
    }
}