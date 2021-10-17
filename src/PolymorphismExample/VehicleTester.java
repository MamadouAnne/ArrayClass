package PolymorphismExample;

public class VehicleTester {
    public static void main(String[] args) {
        // We can create an array of vehicles
        Vehicles[] vehicles = new Vehicles[3];

        // Add a Car, Plane and Boat objects to the array
        vehicles[0] = new Car();
        vehicles[1] = new Plane();
        vehicles[2] = new Boat();

        for (Vehicles vehicle : vehicles) {
            System.out.println(vehicle.speed);
        }
    }
}
