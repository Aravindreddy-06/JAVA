import java.util.*;

class RemoveDuplicates{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        // Input
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }

        // Convert List → LinkedHashSet (removes duplicates, keeps order)
        Set<Integer> set = new LinkedHashSet<>(list);

        // Print result
        for(int num : set){
            System.out.print(num + " ");
        }
    }
}