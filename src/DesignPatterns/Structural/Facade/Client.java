package DesignPatterns.Structural.Facade;

public class Client {
    public static void main(String[] args) {

        // Usual steps to watch movie
        // setup each & everything which will make client class looks clumsier

        // using facade
        DVDPlayer dvd = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem sound = new SoundSystem();
        Lights lights = new Lights();

        HomeTheatreFacade homeTheater = new HomeTheatreFacade(dvd, projector, sound, lights);

        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();

    }
}
