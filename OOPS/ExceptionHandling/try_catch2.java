public class try_catch2{
    public static void main(String args[]){
        try{
            int a = 10/0;
            int arr[] = new int[5];
            arr[10] = 50;
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception Occured.");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception Occured");
        }catch(Exception e){
            System.out.println("General Exception Occured.");
        }
    }
}