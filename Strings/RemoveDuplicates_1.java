import java.util.*;

public class RemoveDuplicates_1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int freq[] = new int[26];

        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }
        

        System.out.println("Distinct Characters: ");
        for(int i=0; i<freq.length; i++){
            if(freq[i] > 0){
                System.out.print((char)(i + 'a') + " ");
            }    
        }
    }
}