//Lambda fro runnable : Thread without ananymous class.
import java.util.*;

public class p08{
    public static void main(String args[]){
        Runnable r = () -> {System.out.println("Thread is Running..");};

        new Thread(r).start();
    }
}

/*
✅ Even Shorter (Best Practice)
public class LambdaThread {
    public static void main(String[] args) {

        new Thread(() -> System.out.println("Thread running...")).start();

    }
}
*/