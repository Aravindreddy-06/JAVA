class Finally{
    public static void main(String args[]){
        int num[] = {1,2,3};
        try{
            System.out.println(num[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception Caught: " + e);
        }finally{
            System.out.println("This Block Always Executes");
        }
        System.out.println("Program Continues");
    }
}