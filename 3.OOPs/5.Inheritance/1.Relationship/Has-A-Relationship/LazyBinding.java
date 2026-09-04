/*
In Java, this is usually called late binding (also called dynamic binding) 
— it means the method to be executed is decided at runtime,  not at compile time. 
This happens with method overriding and polymorphism.
*/


class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class LazyBinding {
    public static void main(String[] args) {
        Animal a; // reference type is Animal

        a = new Dog();
        a.sound();  // Dog barks — decided at runtime

        a = new Cat();
        a.sound();  // Cat meows — decided at runtime

    }
}