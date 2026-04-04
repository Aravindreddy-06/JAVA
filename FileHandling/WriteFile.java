import java.io.FileWriter;
import java.io.IOException;

public class WriteFile{
    public static void main(String args[]){
        try{
            FileWriter writer = new FileWriter("file2.txt");
            writer.write("Aravind Kumar Reddy.");
            writer.close();
            System.out.println("Successfully Written");
        }
        catch(IOException e){
            System.out.println("An Error has Occured.");
            e.printStackTrace();
        }
    }
}