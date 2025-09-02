package JavaFundamentals.ShallowVsDeepCopy.DeepCopy;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {

        Address address = new Address("Pondicherry");
        Person p1 = new Person("Prem", 25, address);
        p1.display();

        // Clone object (deep copy)
        Person p2 = (Person) p1.clone();
        p2.display();

        // Modify cloned object
        p2.getAddress().setCity("Chennai");
        p2.setAge(27);
        p2.setName("Prem Kumar");

        System.out.println("\nAfter modifying cloned object:");
        p1.display(); // Original remains unaffected
        p2.display(); // Cloned object changed independently
    }
}
