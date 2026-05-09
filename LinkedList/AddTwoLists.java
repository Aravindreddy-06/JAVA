import java.util.*;

class Node{
    int data;
    Node link;

    Node(int data){
        this.data = data;
        this.link = null;
    }
}

public class AddTwoLists{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Node head1 = null, temp1 = null;
        Node head2 = null, temp2 = null;

        System.out.println("How many nodes you want in List 1? ");
        int n = sc.nextInt();
        System.out.println("How many nodes you want in List 2? ");
        int m = sc.nextInt();

        System.out.println("Enter the values of the List1 in sorted order: ");
        for(int i=1; i<=n; i++){
            int val = sc.nextInt();
            Node newnode = new Node(val);

            if(head1 == null){
                head1 = newnode;
                temp1 = newnode;
            }else{
                temp1.link = newnode;
                temp1 = newnode;
            }
        }
        System.out.println("Enter the values of the List2 in sorted order: ");
        for(int i=1; i<=m; i++){
            int val = sc.nextInt();
            Node newnode = new Node(val);

            if(head2 == null){
                head2 = newnode;
                temp2 = newnode;
            }else{
                temp2.link = newnode;
                temp2 = newnode;
            }
        }
        Node dummy = new Node(-1);
        Node curr = dummy;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                curr.link = head1;
                head1 = head1.link;
            }else{
                curr.link = head2;
                head2 = head2.link;
            }
            curr = curr.link;
        }
        if(head1 != null) curr.link = head1;
        else curr.link = head2;

        System.out.println("Merged Sorted Lists: ");
        Node temp = dummy.link;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.link;
        }
        System.out.print("NULL");
    }
}
