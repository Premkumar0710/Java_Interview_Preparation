package DesignPatterns.Behavioural.Strategy;

public class Client {
    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps();
        googleMaps.findPath("Delhi", "Agra", "Walk");
    }

    // other examples of strategy : uber booking (cab booking , auto booking)
    // book my show (ipl tickets , movie tickets , concert tickets)
}
