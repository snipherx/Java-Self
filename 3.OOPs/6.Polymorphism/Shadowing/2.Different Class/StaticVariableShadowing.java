/*
For Variable(Static or non-Static) shadowing Relationship between class is important
*/
class Parent {
    static int count = 100; // Static variable in Parent class
}

class Child extends Parent {
    static int count = 200; // Shadows Parent's static variable

    void display() {
        // Accessing Child's own static variable directly
        System.out.println("Child's count: " + count); // 200

        // Good practice: access Parent's static variable via class name, not super
        System.out.println("Parent's count: " + Parent.count); // 100
    }
}
/**
 * StaticVariableShadowing
 */
public class StaticVariableShadowing {

    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
