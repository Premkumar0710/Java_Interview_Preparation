package InterviewPrep.UnknownConcepts.MarkerInterface.Cloneable;

public class CloneableDemo {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e1 = new Employee("Prem",1);
        Employee e2 = (Employee) e1.clone();
        e1.display();
        e2.display();
        System.out.println("-----------------");
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
    }
}
