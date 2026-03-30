//Using MultiLevel Inheritance 

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
class Puppy extends Dog{
    void sound(){
        System.out.println("Puppy makes cute sound");
    }
    void eat(){
        System.out.println("Puppy is eating small food");
    }
}

public class OverRiding_3{
    public static void main(String args[]){
        Animal a;
        a = new Dog();
        a.sound();
        a.eat();

        a = new Puppy();
        a.sound();
        a.eat();
    }
}