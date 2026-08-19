class Engine {

    void start() {
        System.out.println("Engine starts");
    }
}

class CarEngine extends Engine {

    @Override
    void start() {
        System.out.println("Car Engine starts");
    }
}

class Car {

    Engine e;   // Car HAS-A Engine

    Car(Engine e) {
        this.e = e;
    }

    void startCar() {
        e.start();   // Late Binding
    }
}

public class LazyBinding {
    public static void main(String[] args) {

        Engine e = new CarEngine();

        Car c = new Car(e);

        c.startCar();
    }
}
