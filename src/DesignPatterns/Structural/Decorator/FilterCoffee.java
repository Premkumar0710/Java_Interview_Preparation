package DesignPatterns.Structural.Decorator;

public class FilterCoffee extends CoffeeDecorator{

    public FilterCoffee(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + filter";
    }

    @Override
    public double getMoney() {
        return super.getMoney() + 10;
    }
}
