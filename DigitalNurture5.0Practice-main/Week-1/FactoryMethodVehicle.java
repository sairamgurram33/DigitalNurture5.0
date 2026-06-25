//Factory Method provides an interface for creating objects in a superclass,that allows subclasses to decide which class to instantiate.
interface Vehicle {
    void getType();
}

class Car implements Vehicle {
    public void getType() {
        System.out.println("This vehicle is a Car");
    }
}

class Bike implements Vehicle {
    public void getType() {
        System.out.println("This vehicle is a Bike");
    }
}

class Truck implements Vehicle {
    public void getType() {
        System.out.println("This vehicle is a Truck");
    }
}

abstract class VehicleFactory {
    public Vehicle getVehicle() {
        Vehicle vehicle = createVehicle();
        vehicle.getType();
        return vehicle;
    }

    public abstract Vehicle createVehicle();
}

class CarFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}

class BikeFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }
}

class TruckFactory extends VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Truck();
    }
}

public class FactoryMethodVehicle {
    public static void main(String[] args) {
        VehicleFactory car = new CarFactory();
        car.getVehicle();

        VehicleFactory bike = new BikeFactory();
        bike.getVehicle();

        VehicleFactory truck = new TruckFactory();
        truck.getVehicle();
    }
}
