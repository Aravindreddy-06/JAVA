/*
2. O – Open/Closed Principle (OCP)
👉 Open for extension, closed for modification

✅ Explanation:

To add new shape → create new class
No need to modify existing code ✔️
*/

abstract class Shape{
    abstract void draw();
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle.");
    }
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing Rectangle.");
    }
}

public class Ocp{
    public static void main(String args[]){
        Shape s;
        s = new Circle();
        s.draw();

        s = new Rectangle();
        s.draw();
    }
}