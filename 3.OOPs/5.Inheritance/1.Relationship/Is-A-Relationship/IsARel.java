class Animal //Parent Class
{
    void eat()
    {
        System.out.println("Can eat");
    }
}

class Dog extends Animal //Child Class
{
    void bark()
    {
        System.out.println("Can Bark");
    }
}

public class IsARel {
    public static void main(String[] args) {
        Dog d=new Dog();
    d.eat(); // inherited from Animal
    d.bark(); // Dog's own method
    }
}
