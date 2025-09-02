package JavaFundamentals.ShallowVsDeepCopy.ShallowCopy;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {

        Address address = new Address("Pondicherry");
        Person p1 = new Person("Prem",25,address);
        p1.display();

        Person p2 = (Person) p1.clone();
        p2.display();

        p2.getAddress().setCity("Chennai");
        p2.setAge(27);
        p2.setName("Prem Kumar");

        p1.display(); // here address is changed to chennai, so address obj is common to both p1 & p2; it shares the memory
        // obviously here we wont consider primitives as they are raw values, but for objects they share the memory
    }
}
