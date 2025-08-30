package DesignPatterns.Creational.Prototype;


public class Employee implements Prototype{

    String name;
    int id;
    String designation;

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
    }
    // copy constructor
    public Employee(Employee emp){
        this.name = emp.name;
        this.id = emp.id;
        this.designation = emp.designation;
    }

    @Override
    public Prototype clone() {
        return new Employee(this);
    }

    public void showDetails() {
        System.out.println("Name: " + name + ", Designation: " + designation);
    }
}
