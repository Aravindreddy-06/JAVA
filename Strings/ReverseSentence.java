import java.util.*;

public class ReverseSentence{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Sentence: ");
        String s = sc.nextLine();

        String result = "";
        String word = "";
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) != ' '){
                word = s.charAt(i) + word;
            }else{
                result += word + " ";
                word = "";
            }     
        }
        result += word;
        System.out.print(result.trim());
    }
}