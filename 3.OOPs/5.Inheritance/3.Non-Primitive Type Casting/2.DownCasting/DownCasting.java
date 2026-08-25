class Animal
{
    public void eat()
    {
        System.out.println("Animal can eat");
    }
}
class Dog extends Animal
{
    public void eat()
    {
        System.out.println("Dog can eat bone");
    }
    public void bark()
    {
        System.out.println("Dog can bark");
    }
}

/**
 * Upcasting
 */
public class DownCasting {

    public static void main(String[] args) {
        Dog d=new Dog();
         // Upcasting: Dog -> Animal
        Animal a = d;   // implicit, no cast needed

        a.eat();   // Output: "Dog eats bone" (runtime polymorphism)
        // a.bark();  // ❌ Compile error — Animal reference doesn't know bark()

         // Downcasting: Animal -> Dog
            Dog d2 = (Dog) a;   // explicit cast required
            d2.eat();           // Output: "Dog can eat bone"
            d2.bark();          // Output: "Dog can bark" — now accessible
    }
}

