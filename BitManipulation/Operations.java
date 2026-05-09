import java.util.*;

public class Operations{
    public static void main(String args[]){
        int a = 5;  //0101
        int b = 3;  //0011

        //AND
        System.out.println("a & b = " + (a & b));

        //OR
        System.out.println("a | b = " + (a | b));

        //XOR
        System.out.println("a ^ b = " + (a ^ b));

        //Left Shift (<<)
        System.out.println("a << b = " + (a << 1));

        //Right Shift(>>)
        System.out.println("a >> b = " + (a >> 1));

        //NOT(~)
        System.out.println("~a = " + (~a));

        int n = 5;  //0101
        int i = 1;  //bit position

        //check ith bit
        if((n & (1 << i)) != 0){
            System.out.println("Bit " + i + " of " + n + " is SET ");
        }else{
            System.out.println("Bit " + i + " of " + n + " is NOT SET ");
        }

        //set ith bit
        int setResult = n | (1 << i);
        System.out.println("After setting bit: " + i + ": " + setResult);

        //Clear ith bit
        int clearResult = n & ~(1 << i);
        System.out.println("After clearing bit " + i + ": " + clearResult);

        //Toggle ith bit
        int toggleResult = n ^(1 << i);
        System.out.println("After toggling bit " + i + ": " + toggleResult);

        //check Odd or Even
        if((n & 1) == 1){
            System.out.println(n + " is Odd");
        }else{
            System.out.println(n + " is Even");
        }
    }
}