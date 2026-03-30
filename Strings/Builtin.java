public class Builtin{
    public static void main(String args[]){
        String s = "Aravind Kumar Reddy";
        String t = "Aravind Kumar Redd";

        //Returns Length od the String
        int len = s.length();
        System.out.println(len);

        char ch = s.charAt(8);
        System.out.println(ch);

        String sub = s.substring(1,4);
        System.out.println(sub);

        System.out.println(s.equals(t));

        System.out.println(s.indexOf('K'));

        System.out.println(s.contains("edd"));

        char arr[] = s.toCharArray();
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }

        String str[] = s.split(" ");
        for(int i=0; i<str.length; i++){
            System.out.println(str[i] + " ");
        }

        s = s.replace('d','x');
        System.out.println(s);

        s = s.toLowerCase();
        System.out.println(s);

        s = s.toUpperCase();
        System.out.println(s);
    }
}