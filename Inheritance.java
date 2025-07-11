// Parent class definition
class Parent {
    void show() {
        System.err.println("Polaris School of Tech");
    }
}

// Child class definition (extends Parent)
class Child extends Parent {

    void show_name() {
        System.out.println(".(Kallal)");
    }

    void show_name2() {
        System.out.println(".(Raj)");
    }

    void show_name3() {
        System.out.println(".(Ritam)");
    }
}

// Main class containing the main method
public class Inheritance {

    public static void main(String[] args) {
        // Create an instance of the Child class
        Child c1 = new Child();
        
        // Call the inherited method from Parent class
        c1.show();
        
        // Call the methods from the Child class
        c1.show_name();
        c1.show_name2();
        c1.show_name3();
    }
}
