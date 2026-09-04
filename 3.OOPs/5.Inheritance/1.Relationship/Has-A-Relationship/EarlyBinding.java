class Engine {

    void start() {
        System.out.println("Engine starts");
    }
}

class Car {

    Engine e = new Engine();   // Car HAS-A Engine

    void drive() {
        e.start();             // Early binding
        System.out.println("Engine='on' --> Now we can Drive");
    }
}

public class EarlyBinding {
    public static void main(String[] args) {

        Car c = new Car();

        c.drive();
    }
}
