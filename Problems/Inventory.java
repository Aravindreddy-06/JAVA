import java.util.*;

public class Inventory{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        while(true){
            System.out.println("\n--- INVENTORY MENU ---");
            System.out.println("1.Add Item");
            System.out.println("2.Remove Item");
            System.out.println("3.View Item");
            System.out.println("4.Exit");

            System.out.println("Enter Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if(choice == 1){
                System.out.println("Enter item name: ");
                String item = sc.nextLine();
                list.add(item);
                System.out.println("Item added!");
            }else if(choice == 2){
                System.out.println("Enter item to remove: ");
                String item = sc.nextLine();
                if(list.contains(item)){
                    list.remove(item);
                    System.out.println("Item Removed");
                }else{
                    System.out.println("Item not found!");
                }
            }else if(choice == 3){
                if(list.isEmpty()){
                    System.out.println("Inventory is Empty!");
                }else{
                    System.out.println("Items in inventory: ");
                    for(String item : list){
                        System.out.println(item);
                    }
                }
            }else if(choice == 4){
                System.out.println("Exiting..");
                sc.close();
                break;
            }else{
                System.out.println("Invalid Option!");
            }
        }
    }
}