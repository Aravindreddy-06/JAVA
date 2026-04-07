import java.util.*;

class Node{
    int data;
    Node link;

    Node(int data){
        this.data = data;
        this.link = null;
    }
}

public class CycleDetection{

    public static boolean hasCycle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.link != null){
            slow = slow.link;
            fast = fast.link.link;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Node head = null;
        Node temp = null;

        System.out.println("How many Nodes you want? ");
        int n = sc.nextInt();

        System.out.println("Enter the Data to the nodes: ");
        for(int i=1; i<=n; i++){
            int val = sc.nextInt();

            Node newnode = new Node(val);

            if(head == null){
                head = newnode;
                temp = newnode;
            }else{
                temp.link = newnode;
                temp = newnode;
            }
        }
        if (head != null && head.link != null) {
            temp.link = head.link;   // last node points to 2nd node
        }
        
        if(hasCycle(head)){
            System.out.println("Cycle Detected!");
        }else{
            System.out.println("No Cycle");
        }
        sc.close();
    }
}