import java.util.*;

public class Operations {
    public static void main(String args[]) {
        String str = "Aravind Kumar Reddy";

        //str.length() -> Find the length of the string.
        System.out.println("Length of the String: " + str.length());

        //Str.charAt(index) -> Find the character at the index.
        System.out.println("Character at index 2: " + str.charAt(2));

        //str.substring(start,end) -> gives substring from start to end.
        System.out.println("Substring :" + str.substring(3,6+1));

        //equals() -> (== Compares memory address) ->   equals()->Compares actual string value
        System.out.println("Equal? :" + str.equals("Aravind Kumar Reddy"));

        //toUpperCase() -> converts whole string into uppercase.
        System.out.println("UpperCase: " + str.toUpperCase());

        //toLowerCase() -> converts whole string into lowercase.
        System.out.println("LowerCase: " + str.toLowerCase());

        //str.indexOf() -> Finds the index of the character.
        System.out.println("Index of the char: " + str.indexOf('a'));

        //str.replace('a','k') -> replaces all 'a's with 'k';
        System.out.println("Replace a->k " + str.replace('a','j'));

        //split(" ") -> It splits the string into words.
        String arr[] = str.split(" ");
        System.out.println("First Word: " + arr[2]);

        //trim() -> It removes the spaces at the beginning and ending of the string.
        String s = "  Java  ";
        System.out.println("Before Trim: " + s);
        System.out.println("After Trim: " + s.trim());
    }
}