package DesignPatterns.Creational.Factory;

public class Client {
    public static void main(String[] args) {

        // old method
        Car car = new Car();
        car.drive();

        // factory method
        Vehicle v1 = VehicleFactory.getVehicle("car");
        v1.drive();

    }
}
