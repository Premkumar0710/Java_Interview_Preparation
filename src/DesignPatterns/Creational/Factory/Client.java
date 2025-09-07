package DesignPatterns.Creational.Factory;

public class Client {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car car = carFactory.getCar(String.valueOf(CarNames.SUV));
        car.drive();

        /*
         Why use Factory Pattern?

        Encapsulation of object creation → Clients don’t need to know the new keyword details.
        Easier maintenance → Add new classes (like Truck) without changing client code.
        Loose coupling → Client depends only on the interface, not on the concrete class.

         */
    }
}
