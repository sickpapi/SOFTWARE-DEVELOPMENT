import java.util.*;

public class OOP {
    abstract static class Vehicle {
        public abstract void accelerate();
        public void stop() {
            System.out.println("The vehicle has stopped.");
        }
    }
    
    static class Car extends Vehicle {
        private String name;
        private String accMethod;

        public Car(String name, String accMethod) {
            this.name = name;
            this.accMethod = accMethod;
        }

        public void accelerate() {
            System.out.println(name + " is accelerating by pressing on the " + accMethod + ".");
        }
    }

    static class Plane extends Vehicle {
        private String name;
        private String accMethod;

        public Plane(String name, String accMethod) {
            this.name = name;
            this.accMethod = accMethod;
        }

        public void accelerate() {
            System.out.println(name + " is using its " + accMethod + " to fly.");
        }
    }

    public static void main(String[] args) {
        Car car = new Car("Lamborghini", "pedal");
        Plane plane = new Plane("Boeing", "wings");

        plane.accelerate();
        car.accelerate();
    }
}
