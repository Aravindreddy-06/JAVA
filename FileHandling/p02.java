import java.io.*;
import java.util.*;

public class p02{
    public static void main(String args[]){
        try{
            File file = new File("myfile.txt");
            Scanner sc = new Scanner(file);

            int lineNumber = 1;
            while(sc.hasNextLine()){
                System.out.println(lineNumber + ": "+sc.nextLine());
                lineNumber++;
            }
            sc.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found.");
        }
    }
}