import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data){
        this.data = data;
        left = right = null;
    }
}
public class Inorder{
    static Scanner sc = new Scanner(System.in);

    public static Node buildTree(){
        System.out.print("Enter Value (-1 for null): ");
        int val = sc.nextInt();

        if(val == -1){
            return null;
        }
        Node root = new Node(val);

        System.out.println("Enter left child of " + val);
        root.left = buildTree();

        System.out.println("Enter Right child of " + val);
        root.right = buildTree();

        return root;
    }

    public static void inorder(Node root){
        if(root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String args[]){
        Node myTree = buildTree();

        System.out.println("Inorder Traversal:");
        inorder(myTree);
    }
}