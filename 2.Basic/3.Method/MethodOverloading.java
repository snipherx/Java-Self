//Method Overloading = having multiple methods with the same name but different parameters

public class MethodOverloading {
    // Overload 1: two int parameters
    static int add(int a, int b) {
        return a + b;
    }

    // Overload 2: three int parameters
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overload 3: two double parameters
    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(2, 3));         // calls Overload 1 → 5
        System.out.println(add(2, 3, 4));      // calls Overload 2 → 9
        System.out.println(add(2.5, 3.5));     // calls Overload 3 → 6.0
    }
    
}
