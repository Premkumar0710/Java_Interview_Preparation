package CodingQuestions.LambdasAndStreams.Code_Period_YT.BigProblems.Prob_58;

public class Employee {
    String name;
    String department;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    double salary;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Employee(String name, String department,double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }



}
