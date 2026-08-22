interface Flyable {
    void fly();  //public abstract void fly(); (we can also write like this)
    /*
       Yes, void fly(); is abstract — even though the word abstract never appears.
       In an interface, every method declared like this 
       (just a signature, ending in ; with no body) is implicitly public abstract.
       Java adds those keywords for you behind the scenes.
    */
}

interface Swimmable {
    void swim();
}

// A duck can do BOTH — this is multiple inheritance of type
class Duck implements Flyable, Swimmable {
    public void fly() {
        System.out.println("Duck flies over the pond");
    }
    public void swim() {
        System.out.println("Duck swims in the pond");
    }
}

// A sparrow can ONLY fly, not swim
class Sparrow implements Flyable {
    public void fly() {
        System.out.println("Sparrow flies high");
    }
}

// A dolphin can ONLY swim, not fly
class Dolphin implements Swimmable {
    public void swim() {
        System.out.println("Dolphin swims fast");
    }
}

public class Multi {

    // This method doesn't care WHAT the object is —
    // only that it's "Flyable"
    static void letItFly(Flyable f) {
        f.fly();
    }

    // This method only cares that it's "Swimmable"
    static void letItSwim(Swimmable s) {
        s.swim();
    }

    public static void main(String[] args) {
        Duck duck = new Duck();
        Sparrow sparrow = new Sparrow();
        Dolphin dolphin = new Dolphin();

        letItFly(duck);       // works - Duck IS-A Flyable
        letItFly(sparrow);    // works - Sparrow IS-A Flyable
        // letItFly(dolphin); // ERROR - Dolphin is NOT Flyable

        letItSwim(duck);      // works - Duck IS-A Swimmable
        letItSwim(dolphin);   // works - Dolphin IS-A Swimmable
        // letItSwim(sparrow);// ERROR - Sparrow is NOT Swimmable
    }
}