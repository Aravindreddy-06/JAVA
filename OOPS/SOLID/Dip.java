/*
D – Dependency Inversion Principle (DIP)
👉 Depend on abstraction, not concrete class

✅ Explanation:

Computer depends on Keyboard (interface)
Not tied to specific implementation ✔️
*/

interface Keyboard {
    void type();
}

class WiredKeyboard implements Keyboard {
    public void type() {
        System.out.println("Typing with wired keyboard");
    }
}

// You can easily add another implementation
class WirelessKeyboard implements Keyboard {
    public void type() {
        System.out.println("Typing with wireless keyboard");
    }
}

class Computer {
    Keyboard keyboard;

    // Constructor Injection
    Computer(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    void start() {
        keyboard.type();
    }
}

public class Dip {
    public static void main(String[] args) {
        
        // Using Wired Keyboard
        Keyboard wired = new WiredKeyboard();
        Computer c1 = new Computer(wired);
        c1.start();

        // Using Wireless Keyboard
        Keyboard wireless = new WirelessKeyboard();
        Computer c2 = new Computer(wireless);
        c2.start();
    }
}