public class Builtin{
    public static void main(String args[]){
        StringBuilder s = new StringBuilder("Aravind Kumar");

        s.append("Reddy");
        System.out.println(s);

        s.insert(7, "Reddy");
        System.out.println(s);

        s.delete(8,13);
        System.out.println(s);

        s.deleteCharAt(4);
        System.out.println(s);

        s.replace(1,5,"abhi");
        System.out.println(s);

        s.reverse();
        System.out.println(s);

        char ch = s.charAt(0);
        System.out.println(ch);

        int len = s.length();
        System.out.println(len);

        //This function changes the StringBuilder to String.
        String result = s.toString();
        System.out.println(result);
    }
}