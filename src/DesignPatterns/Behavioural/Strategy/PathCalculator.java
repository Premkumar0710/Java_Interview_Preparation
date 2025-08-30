package DesignPatterns.Behavioural.Strategy;

public interface PathCalculator {
    // we can also name this as PathCalculatorStrategy since strategy Pattern is involved
    void findPath(String fromLocation, String toLocation);
}
