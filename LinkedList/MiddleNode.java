//Find Middle node using fast & slow pointers.

import java.util.*;

class Node{
    int data;
    Node link;

    //Node Creation using Constructor.
    Node(int data){
        this.data = data;
        this.link = null;
    }
}
public class MiddleNode{
    public static Node findMiddle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.link != null){
            slow = slow.link;
            fast = fast.link.link;
        }
        return slow;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Node head = null;
        Node temp = null;

        System.out.println("How many nodes you want?");
        int n = sc.nextInt();

        System.out.print("Enter the data for the nodes: ");
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
        Node mid = findMiddle(head);
        System.out.println("Middle node: " + mid.data);
    }
}