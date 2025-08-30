package DesignPatterns.Structural.Decorator;

public class PlainCoffee implements Coffee{
    @Override
    public String getDescription() {
        return "Plain Coffee";
    }

    @Override
    public double getMoney() {
        return 30;
    }
}
