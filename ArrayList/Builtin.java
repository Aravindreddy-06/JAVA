import java.util.*;

public class Builtin {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        //add() -> Add the Elements into the list.
        list.add(10);
        list.add(20);
        list.add(30);

        //add(index, element) -> Add the Element at certain position.
        list.add(3,40);
        list.add(4,50);
        System.out.println("After Add: " + list);

        //get() -> Accessing the Element at certain index.
        System.out.println("Element at index 2:" + list.get(2));

        //set() -> Replace the Element at the certain position.
        list.set(3,60);
        System.out.println("Elements after Replacing:" + list);

        //size() -> To find the size of the List.
        System.out.println("Size of the List:" + list.size());

        //contains() -> Checks if Element Exists?
        System.out.println("Contains 20?: " + list.contains(20));

        //indexOf() -> Find the Index of the Element.
        System.out.println("Index of 30 :" + list.indexOf(30));

        //add more elements
        list.add(70);
        list.add(80);

        //list.remove(index) -> to remove the one value at any index.
        list.remove(4);

        //list.remove(Integer.valueOf(80)) -> to remove the one value in the list.
        list.remove(Integer.valueOf(80));

        //sort() -> sort the Elements
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        //reverse() -> Reverse the Elements
        Collections.reverse(list);
        System.out.println("Reversed List: " + list);

        //isEmpty() -> checks if the list is Empty.
        System.out.println("list Empty? " + list.isEmpty());

        //clear() -> Removes all elements.
        list.clear();
        System.out.println("After Clear: " + list); 
    }
}