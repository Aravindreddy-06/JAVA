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
public class Creation{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Node head = null;
        Node temp = null;

        System.out.println("How many nodes you want?");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.print("Enter the data for the node: " + i +" ");
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
        temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.link;
        }
        System.out.println("NULL");
        sc.close(); //Optional
    }
}