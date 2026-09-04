// Abstract class
abstract class Vehicle {
    // Abstract method — no body, just says "every vehicle must be able to move"
    public abstract void move();
}

class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("Car moves on roads"); //implementation of abstract method
    }
}

class Boat extends Vehicle {
    @Override
    public void move() {
        System.out.println("Boat moves on water");  //implementation of abstract method
    }
}

public class AbstractionClass {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Boat();

        v1.move(); // Car moves on roads
        v2.move(); // Boat moves on water
    }
}