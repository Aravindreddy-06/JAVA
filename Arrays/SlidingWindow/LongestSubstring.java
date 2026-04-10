/*
3. Longest Substring Without Repeating Characters
Given a string s, find the length of the longest substring without duplicate characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/


import java.util.*;

public class LongestSubstring{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Set<Character> set = new HashSet<>();

        System.out.println("Enter String: ");
        String s = sc.nextLine();

        int left = 0;
        int max_len = 0;
        for(int right = 0; right<s.length(); right++){
            
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            max_len = Math.max(max_len, right-left+1);
        }
        System.out.println("Maximum Length Without Repeating Characters: " + max_len);
    }
}