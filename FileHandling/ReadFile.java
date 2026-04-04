import java.io.*;
import java.util.*;

public class ReadFile{
    public static void main(String args[]){
        try{
            File obj = new File("file2.txt");
            Scanner Reader = new Scanner(obj);

            while(Reader.hasNextLine()){
                String data = Reader.nextLine();
                System.out.println(data);
            }
            Reader.close();
        }catch(FileNotFoundException e){
            System.out.println("An Error has occured.");
            e.printStackTrace();
        }
    }
}


