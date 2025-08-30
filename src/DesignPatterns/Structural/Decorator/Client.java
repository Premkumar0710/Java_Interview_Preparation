package DesignPatterns.Structural.Decorator;

public class Client {
    public static void main(String[] args) {
        Coffee coffee = new PlainCoffee();
        System.out.println(coffee.getDescription() + " -> " + coffee.getMoney());

        Coffee coffee1 = new FilterCoffee(coffee);
        System.out.println(coffee.getDescription() + " -> " + coffee.getMoney());

        // not getting desired output ; check

    }
}
