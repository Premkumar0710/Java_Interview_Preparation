package DesignPatterns.Creational.Factory;

public class VehicleFactory {
    public static Vehicle getVehicle(String type){

        if(type.equalsIgnoreCase("car")){
            return new Car();
        }
        else if(type.equalsIgnoreCase("bus")){
            return new Bus();
        }
        throw new IllegalArgumentException(type);
    }
}
