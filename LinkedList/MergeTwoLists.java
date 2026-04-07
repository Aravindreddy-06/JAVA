import java.util.*;

class Node {
    int data;
    Node link;

    Node(int data) {
        this.data = data;
        this.link = null;
    }
}

public class MergeTwoLists {

    // 🔗 Function to create linked list
    public static Node createList(Scanner sc) {
        Node head = null, temp = null;

        System.out.print("How many nodes? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter data " + i + ": ");
            int val = sc.nextInt();

            Node newnode = new Node(val);

            if (head == null) {
                head = newnode;
                temp = newnode;
            } else {
                temp.link = newnode;
                temp = newnode;
            }
        }
        return head;
    }

    // 🔁 Merge function
    public static Node merge(Node h1, Node h2) {
        Node dummy = new Node(-1);
        Node tail = dummy;

        while (h1 != null && h2 != null) {
            if (h1.data <= h2.data) {
                tail.link = h1;
                h1 = h1.link;
            } else {
                tail.link = h2;
                h2 = h2.link;
            }
            tail = tail.link;
        }

        // remaining nodes
        if (h1 != null) tail.link = h1;
        else tail.link = h2;

        return dummy.link;
    }

    // 🖨 Print function
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.link;
        }
        System.out.println("NULL");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Create First Sorted List:");
        Node head1 = createList(sc);

        System.out.println("Create Second Sorted List:");
        Node head2 = createList(sc);

        System.out.print("List 1: ");
        printList(head1);

        System.out.print("List 2: ");
        printList(head2);

        // 🔗 Merge
        Node merged = merge(head1, head2);

        System.out.print("Merged List: ");
        printList(merged);

        sc.close();
    }
}