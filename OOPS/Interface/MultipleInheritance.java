interface add{
    int add(int a, int b);
}
interface sub{
    int sub(int a, int b);
}

class cal implements add,sub{
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
}

class MultipleInheritance{
    public static void main(String args[]){
        cal x = new cal();

        System.out.println("Addition: "+ x.add(2,1));
        System.out.println("Subtraction: "+ x.sub(2,1));

    }
}