import java.util.Scanner;
import java.util.ArrayList;

class SumOfSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        System.out.println("Enter Length of the List: ");
        int n = sc.nextInt();
        
        System.out.println("Enter Elements: ");
        for(int i=0; i<n; i++){
            list.add(sc.nextInt());
        }
        
        int sum = 0;
        for(int i=0; i<list.size(); i++){
            if((list.get(i)) %2 == 0){
                sum += list.get(i) * list.get(i);
            }
        }
        System.out.println(sum);
    }
}