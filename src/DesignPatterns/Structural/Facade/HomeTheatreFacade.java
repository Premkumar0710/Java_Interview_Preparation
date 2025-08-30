package DesignPatterns.Structural.Facade;

public class HomeTheatreFacade {

    private DVDPlayer dvd;
    private Projector projector;
    private SoundSystem sound;
    private Lights lights;

    public HomeTheatreFacade(DVDPlayer dvd, Projector projector, SoundSystem sound, Lights lights) {
        this.dvd = dvd;
        this.projector = projector;
        this.sound = sound;
        this.lights = lights;
    }

    public void watchMovie(String movie){
        System.out.println("Get ready to watch the drama ...");
        lights.turnOn();
        lights.mode("dim");
        projector.turnOn();
        sound.turnOn();
        sound.setVolume(20);
        dvd.turnOn();
        dvd.play();
    }

    public void endMovie(){
        System.out.println("Movie over..go to sleep");
        projector.turnOff();
        dvd.turnOff();
        lights.turnOff();
    }
}
