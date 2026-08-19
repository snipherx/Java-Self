class Animal
{
    void eat()
    {
        System.out.println("Can eat");
    }
}

class Dog extends Animal
{
    void bark()
    {
        System.out.println("Can bark");
    }
}

class Cat extends Animal
{
    void meow()
    {
        System.out.println("Can meow");
    }
}

public class Hierarchial {
   public static void main(String[] args)
    {
        Dog d = new Dog();
        System.out.println("Dog:-");
        d.eat();       // inherited from Animal
        d.bark();

        Cat c = new Cat();
        System.out.println("Cat:-");
        c.eat();       // inherited from Animal
        c.meow();
    } 
}
