package DesignPatterns.Structural.Decorator;

public class CoffeeDecorator implements Coffee{
    Coffee coffee;

    public CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;
    }
    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public double getMoney() {
        return coffee.getMoney();
    }
}
