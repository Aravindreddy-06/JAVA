import java.util.*;

public class RemoveDuplicates_2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String result = "";
        boolean seen[] = new boolean[26];

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(!seen[ch - 'a']){
                seen[ch - 'a'] = true;
                result += ch;
            }
        }
        System.out.print(result);
    }
}