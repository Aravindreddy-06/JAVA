import java.util.*;

public class Sample{
    public static void main(String args[]){
        Set<Integer> st = new HashSet<>();

        st.add(1);
        st.add(2);
        st.add(3);
        st.add(1);

        System.out.println("Size: " + st.size());
        System.out.println("Elements: " + st); 
    }
}