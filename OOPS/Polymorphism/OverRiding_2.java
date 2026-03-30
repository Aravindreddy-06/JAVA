//Using Hierarchical Inheritance 

class Animal{
    void sound(){
        System.out.println("Animal Makes sound");
    }
    void eat(){
        System.out.println("Animal is Eating");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog is Barking");
    }
    void eat(){
        System.out.println("Dog is Eating");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cat is meowing");
    }
    void eat(){
        System.out.println("Cat is Eating");
    }
}

public class OverRiding_2{
    public static void main(String args[]){
        Animal a;
        a = new Dog();
        a.sound();
        a.eat();

        a = new Cat();
        a.sound();
        a.eat();
    }
}