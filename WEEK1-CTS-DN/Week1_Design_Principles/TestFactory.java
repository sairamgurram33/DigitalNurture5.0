package Week1_Design_Principles;

public class TestFactory {

    public static void main(String[] args) {

        vehicle v1 = VehicleFactory.getVehicle("car");
        v1.drive();

        vehicle v2 = VehicleFactory.getVehicle("bike");
        v2.drive();
    }
}