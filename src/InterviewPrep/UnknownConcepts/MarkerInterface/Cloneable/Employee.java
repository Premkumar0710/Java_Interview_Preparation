package InterviewPrep.UnknownConcepts.MarkerInterface.Cloneable;

public class Employee implements Cloneable{

    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // it returns clone from Object class
    }
    public void display() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }


}
