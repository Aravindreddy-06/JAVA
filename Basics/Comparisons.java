//The Program shows How to compare Element by Element and Full Comparison in Loops.
import java.util.*;

public class Comparisons{
    public static void main(String args[]){
        /*
        //1. String(Element by Element)
        String s1 = "Aravind";
        String s2 = "Kumar";
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                System.out.println("Mismatch at: " + i);
                break;
            }
        }
        //1. String(Full Comparison)
        s1.equals(s2);
        */

        /*
        //2. StringBuilder(Element by Element)
        StringBuilder sb1 = new StringBuilder("Aravind");
        StringBuilder sb2 = new StringBuilder("Kumar");
        for(int i=0; i<sb1.length(); i++){
            if(sb1.charAt(i) != sb2.charAt(i)){
                System.out.println("Mismatch at: " + i);
                break;
            }
        }
        //2. StringBuilder(Full)
        sb1.toString().equals(sb2.toString());
        */

        /*
        //3.Array(Element by Element)
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {5,6,7,8,9};
        for(int i=0; i<arr1.length; i++){
            if(arr1[i] != arr2[i]){
                System.out.println("Mismatch at :" + i);
                break;
            }
        }
        //3. Array(Full)
        Arrays.equals(arr1,arr2);
        */

        /*
        //4.ArrayList(Element by Element)
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(4,5,6,7));
        for(int i=0; i<list1.size(); i++){
            if(!list1.get(i).equals(list2.get(i))){
                System.out.println("Mismatch at :" + i);
                break;
            }
        }
        //4.ArrayList(Full)
        list1.equals(list2);
        */

        /*
        //5.LinkedList(Element by Element)
        List<Integer> list1 = new LinkedList<>(Arrays.asList(1,2,3,4));
        List<Integer> list2 = new LinkedList<>(Arrays.asList(4,5,6,7));
        for(int i=0; i<list1.size(); i++){
            if(!list1.get(i).equals(list2.get(i))){
                System.out.println("Mismatch at :" + i);
            }
        }
        //5.LinkedList(Full)
        list1.equals(list2);
        */

        /*
        //6.SET(Element)
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(8,5,6,7));

        for(int x : set1){
            if(!set2.contains(x)){
                System.out.println("Mismatch at: " + x);
                break;
            }
        }
        //6. SET(Full)
        set1.equals(set2);
        */

        /*
        //7.MAP(Element by Element)
        Map<Integer,Character> map1 = new HashMap<>();
        Map<Integer,Character> map2 = new HashMap<>();
        map1.put(1,'A');
        map1.put(2,'B');
        map2.put(1,'C');
        map2.put(2,'C');

        for(Integer key : map1.keySet()){
            if(!map2.containsKey(key) || !map1.get(key).equals(map2.get(key))){
                System.out.println("Mismatch at Key: " + key);
                break;
            }
        }
        //7.MAP(Full)
        map1.equals(map2);
        */
    }
}