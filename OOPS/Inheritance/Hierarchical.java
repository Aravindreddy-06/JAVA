class Animal{
    void eat(){
        System.out.println("Animal is Eating");
    }
}

class Cat extends Animal{
    void meow(){
        System.out.println("Cat is Meowing");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is Barking");
    }
}


public class Hierarchical{
    public static void main(String args[]){
        Dog d = new Dog();
        Cat c = new Cat();

        d.eat();
        d.bark();

        c.eat();
        c.meow();
    }
}