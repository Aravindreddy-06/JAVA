//Using Hierarchical Inheritance 

class Animal{
    void sound(){
        System.out.print("Animal makes sound");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.print("Dog is Barking");
    }
}

public class OverRiding_1{
    public static void main(String args[]){
        Animal a = new Dog();
        a.sound();
    }
}