package DesignPatterns.Creational.Factory;

public class CarFactory {

    public Car getCar(String carType){
        if(carType.equalsIgnoreCase(String.valueOf(CarNames.SEDAN))){
            return new Sedan();
        }
        else if(carType.equalsIgnoreCase(String.valueOf(CarNames.SUV))){
            return new SUV();
        }
        else return null;
    }
}
