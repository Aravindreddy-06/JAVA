import java.util.*;

public class ReverseList{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        List<Integer> list = new LinkedList<>();

        System.out.println("Enter the Size od the List: ");
        int n = sc.nextInt();

        System.out.println("Enter the Elements into LinkedList: ");
        for(int i=1; i<=n; i++){
            int x = sc.nextInt();
            list.add(x);
        }

        Collections.reverse(list);
        System.out.println(list);
    }
}