import java.io.File;
import java.io.IOException;

public class CreateFile{
    public static void main(String[] args){
        File file = new File("file2.txt");

        try{
            boolean value = file.createNewFile();
            if(value){
                System.out.println("The new file is created: " + file.getName());
            }else{
                System.out.println("The file already exists.");
            }
        }catch(Exception e){
            e.getStackTrace();
        }
    }
}