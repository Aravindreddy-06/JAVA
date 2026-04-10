import java.util.*;

public class ThreeSum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> res = new ArrayList<>();

        System.out.println("Enter the Size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        for(int i=0; i<n-2; i++){
            if(i>0 && arr[i] == arr[i-1]) continue;

            int j = i+1, k = n-1;
            while(j < k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum == 0){
                    res.add(Arrays.asList(arr[i],arr[j],arr[k]));
                    while(j<k && arr[j] == arr[j+1]) j++;
                    while(j<k && arr[k] == arr[k-1]) k--;
                    k--;
                    j++;
                }else if(sum > 0){
                    k--;
                }else{
                    j++;
                }
            }
        }
        System.out.println("Triplets: " + res);
    }
}