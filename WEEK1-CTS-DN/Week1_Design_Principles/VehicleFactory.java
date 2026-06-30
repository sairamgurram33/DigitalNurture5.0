package Week1_Design_Principles;

class Car implements vehicle {
    public void drive() {
        System.out.println("Driving Car");
    }
}

class Bike implements vehicle {
    public void drive() {
        System.out.println("Driving Bike");
    }
}

public class VehicleFactory {

    public static vehicle getVehicle(String type) {

        if(type.equalsIgnoreCase("car")) {
            return new Car();
        }

        if(type.equalsIgnoreCase("bike")) {
            return new Bike();
        }

        return null;
    }
}