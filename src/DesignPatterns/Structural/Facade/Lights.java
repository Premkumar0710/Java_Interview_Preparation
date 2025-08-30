package DesignPatterns.Structural.Facade;

public class Lights {
    void turnOn(){
        System.out.println("Turning On..");
    }

    void mode(String value){
        if (value.equalsIgnoreCase("dim")){
            System.out.println("Turning light under dim mode");
        }
        else System.out.println("Turning light under normal mode");
    }

    void turnOff(){
        System.out.println("Turning Off..");
    }
}
