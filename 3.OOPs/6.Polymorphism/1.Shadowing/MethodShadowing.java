/*
1.Method Shadwoing done only in different classes
2.Method always should be static
*/
class Parent {
    // Static method in Parent class
    static void show() {
        System.out.println("Parent's static show()");
    }
}

public class MethodShadowing extends Parent  //This is Child class
{
    // Static method with same name & signature — this HIDES (shadows) Parent's show()
    static void show() {
        System.out.println("Child's static show()");
    }

    public static void main(String[] args) {
        // Calling Child's own static method directly
        show(); // Child's static show() & here we shadow Parent class show() method

        // Accessing Parent's hidden static method via class name
        Parent.show(); // Parent's static show()
    }
}