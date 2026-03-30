import java.util.*;

public class Anagram{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();

        if(s.length() != t.length()){
            System.out.print("Not an Anagram");
            return;
        }
        boolean isAnagram = true;
        int freq[] = new int[26];

        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for(int count : freq){
            if(count != 0){
                isAnagram = false;
                break;
            }
        }
        if(isAnagram){
            System.out.print("True");
        }else{
            System.out.print("False");
        }
    }
}