class Animal
{
    void eat()
    {
        System.out.println("Animal can eat");
    }
}
class Dog extends Animal
{
    void eat()
    {
        System.out.println("Dog eat bones");
    }
    void bark()
    {
        System.out.println("Dog can bark");
    }
}
class Cat extends Animal
{
    void eat()
    {
        System.out.println("Cat eat Fish");
    }
}

/**
 * Demo
 */
public class Demo {

    public static void main(String[] args) {
        Animal a;
        a=new Dog();
        a.eat();
        Dog d=(Dog) a;
        d.eat();
        d.bark();
    }
}