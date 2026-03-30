import java.util.*;

public class ValidParenthesis {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Character> st = new Stack<>();

        System.out.print("Enter the Parenthesis: ");
        String s = sc.nextLine();

        for (char c : s.toCharArray()) {

            // Push opening brackets
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } 
            // Handle closing brackets
            else {
                if (st.isEmpty()) {
                    System.out.println("False");
                    return;
                }

                char top = st.pop();

                // Check mismatch (single condition)
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    System.out.println("False");
                    return;
                }
            }
        }

        // Final check
        System.out.println(st.isEmpty());

        sc.close();
    }
}