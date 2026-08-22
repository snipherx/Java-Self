class Animal {              // Grandparent

    void eat() {
        System.out.println("Can eats");
    }
}

class Dog extends Animal {  // Parent

    void bark() {
        System.out.println("Can barks");
    }
}

class Puppy extends Dog {   // Child

    void play() {
        System.out.println("Can plays");
    }
}

public class MultiLevel {
    public static void main(String[] args) {

        Puppy p = new Puppy();
        System.out.println("Puppy Can:-");
        p.eat();    // From Animal
        p.bark();   // From Dog
        p.play();   // From Puppy
    }
}
