package DesignPatterns.Behavioural.Strategy;

public class GoogleMaps {

        public void findPath(String from , String to, String mode){
            PathCalculator pathCalculator = PathCalculatorHelper.getPathCalculatorForMode(mode);
            pathCalculator.findPath(from,to);
        }

}
