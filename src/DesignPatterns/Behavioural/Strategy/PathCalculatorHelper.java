package DesignPatterns.Behavioural.Strategy;

public class PathCalculatorHelper {
    // we can also name this as PathCalculatorFactory since we are using factory Pattern over here

    public static PathCalculator getPathCalculatorForMode(String mode){
        if(mode.equals(TransportMode.CAR)){
            return new CarPathCalculator();
        }
        else if(mode.equals(TransportMode.BIKE)){
            return new BikePathCalculator();
        }
        else return new WalkPathCalculator();
    }
}
