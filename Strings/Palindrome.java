import java.util.*;

public class Palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String rev = "";

        for(int i=0; i<s.length(); i++){
            rev = s.charAt(i) + rev;
        }
        if(s.equals(rev)){
            System.out.print("Palindrome");
        }else{
            System.out.print("Not a Palindrome");
        }
    }
}