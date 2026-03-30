/*
I – Interface Segregation Principle (ISP)
👉 Small interfaces > big interface

✅ Explanation:

No unnecessary methods ✔️
*/

interface Workable{
    void work();
}
interface Eatable{
    void eat();
}

class Human implements Workable,Eatable{
    public void work(){
        System.out.println("Working...");
    }
    public void eat(){
        System.out.println("Eating...");
    }
}

public class Isp{
    public static void main(String args[]){
        Human h = new Human();
        h.work();
        h.eat();
    }
}