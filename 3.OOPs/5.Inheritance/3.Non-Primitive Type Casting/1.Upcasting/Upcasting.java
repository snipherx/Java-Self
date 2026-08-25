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
public class Upcasting {

    public static void main(String[] args) {
        Dog d=new Dog();
         // Upcasting: Dog -> Animal
        Animal a = d;   // implicit, no cast needed

        a.eat();   // Output: "Dog eats bone" (runtime polymorphism)
        // a.bark();  // ❌ Compile error — Animal reference doesn't know bark()
    }
}

/*
-->The compiler only lets you call methods that exist on the reference type (Animal),
even though the real object (Dog) has more.
-->You lose access to subclass-specific members through the upcasted reference.
-->To get bark() back, you'd need to downcasting
*/