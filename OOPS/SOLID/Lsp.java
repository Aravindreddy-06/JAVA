/*
L – Liskov Substitution Principle (LSP)
👉 Child should behave like parent

✅ Explanation:

Sparrow works wherever Bird is used ✔️
*/

class Bird{
    void fly(){
        System.out.println("Flying..");
    }
}
class Sparrow extends Bird{
    void fly(){
        System.out.println("Sparrow can fly");
    }
}

public class Lsp{
    public static void main(String args[]){
        Bird b = new Sparrow();
        b.fly();
    }
}