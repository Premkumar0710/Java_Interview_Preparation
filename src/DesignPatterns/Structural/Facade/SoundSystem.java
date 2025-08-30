package DesignPatterns.Structural.Facade;

public class SoundSystem {
    void turnOn(){
        System.out.println("Turning On..");
    }

    void setVolume(int value){
        System.out.println("Volume set to : " + value);
    }
}
