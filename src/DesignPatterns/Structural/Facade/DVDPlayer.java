package DesignPatterns.Structural.Facade;

public class DVDPlayer {
    void turnOn(){
        System.out.println("Turning On..");
    }

    void play(){
        System.out.println("Streaming..");
    }

    void turnOff(){
        System.out.println("Turning Off..");
    }
}
