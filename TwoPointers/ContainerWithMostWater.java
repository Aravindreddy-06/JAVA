import java.util.*;

public class ContainerWithMostWater{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter Elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int i=0;
        int j=n-1;

        int most_water_area = 0;

        while(i < j){
            int length = Math.min(arr[i], arr[j]);
            int width = j-i;
            most_water_area = Math.max(most_water_area,length*width);

            if(arr[i] <= arr[j]){
                i++;
            }else{
                j--;
            }
        }
        System.out.println("Container With Most Water: " + most_water_area);
    }
}