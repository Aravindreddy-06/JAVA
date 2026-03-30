import java.util.*;

public class Implementation{
    public static void main(String args[]){
        Stack<Integer> stack = new Stack<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Elements: ");
        int n = sc.nextInt();

        System.out.println("Enter Elements: ");
        for(int i=0; i<n; i++){
            int val = sc.nextInt();
            stack.push(val);
        }
        System.out.println("Stack After Push: " + stack);

        //Peek() -> Top Element
        if(!stack.isEmpty()){
            System.out.println("Top Element: " + stack.peek());
        }

        //pop()
        if(!stack.isEmpty()){
            System.out.println("Popped Element: " + stack.pop());
            System.out.println("Stack After pop: " +  stack);
        }

        //isEmpty()
        System.out.println("Is stack empty? " + stack.isEmpty());

        //size()
        System.out.println("Stack size: " + stack.size());

        //Searches the Element and returns its index.
        System.out.println("Enter Element to Search: ");
        int s = sc.nextInt();
        System.out.println("Position from top: " + stack.search(s));

         //contains() returns true or false
        System.out.print("Enter element to check contains: ");
        int c = sc.nextInt();
        System.out.println("Contains? " + stack.contains(c));

        //get(index)
        System.out.print("Enter index to get element: ");
        int idx = sc.nextInt();
        if(idx >= 0 && idx<stack.size()){
            System.out.println("Element at index: " + idx + ": " + stack.get(idx));
        }else{
            System.out.println("Invalid Index");
        }

        //set(index, value);
        System.out.println("Enter the Positin to insert: ");
        int i = sc.nextInt();
        System.out.println("Enter the value to insert: ");
        int v = sc.nextInt();
        if(i >= 0 && i < stack.size()){
            stack.set(i,v);
            System.out.println("Stack After insertion: " + stack);
        }else{
            System.out.println("Invalid index");
        }

        //clear()
        stack.clear();
        System.out.println("Stack After Clear: " + stack);

        //isEmpty()
        System.out.println("Is stack empty now? " + stack.isEmpty());
    }
}