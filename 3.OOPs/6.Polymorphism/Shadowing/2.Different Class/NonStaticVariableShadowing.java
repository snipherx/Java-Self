class Parent {
    int count = 100; // Instance variable in Parent class
}

class Child extends Parent {
    int count = 200; // Shadows Parent's instance variable

    void display() {
        // Accessing Child's own instance variable directly
        System.out.println("Child's count: " + count); // 200

        // Accessing Parent's instance variable using super
        // This IS the correct/recommended way for instance variables
        System.out.println("Parent's count via super: " + super.count); // 100
    }
}
/**
 * NonStaticVariableShadowing
 */
public class NonStaticVariableShadowing {

    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}