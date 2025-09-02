package JavaFundamentals.ShallowVsDeepCopy.DeepCopy;

public class Person implements Cloneable {

    private String name;
    private int age;
    private Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    // Deep copy
    @Override
    public Object clone() throws CloneNotSupportedException {
        Person cloned = (Person) super.clone(); // shallow copy first
        cloned.address = new Address(this.address); // deep copy of Address
        return cloned;
    }

    public void display() {
        System.out.println(name + " lives in " + address.getCity());
    }
}
