// Base class
class Vehicle {
    private String vehicleNumber;

    public Vehicle(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public void honk() {
        System.out.println("Honk !!!!!!!!!!!");
    }

    public void printVehicleNumber() {
        System.out.println(vehicleNumber);
    }
}

// Derived class
class Car extends Vehicle {
    public Car(String carNumber) {
        super(carNumber);
    }
}

// Derived class
class Bus extends Vehicle {
    public Bus(String busNumber) {
        super(busNumber);
    }
}

// Main class (ONLY public class)
public class Main {
    public static void main(String[] args) {
        Car car = new Car("AB12CD2345");
        car.printVehicleNumber();
        car.honk();

        Bus bus = new Bus("XY23MN5678");
        bus.printVehicleNumber();
        bus.honk();
    }
}