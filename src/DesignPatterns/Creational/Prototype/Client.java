package DesignPatterns.Creational.Prototype;

public class Client {

    public static void main(String[] args) {
        Employee e1 = new Employee("Prem",1,"SDE");
        Employee copy = (Employee) e1.clone();
        e1.showDetails();
        // just making a change
        copy.setDesignation("SDE 2");
        copy.showDetails();
    }
}
