package JavaFundamentals.MarkerInterface.Clonable;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {

        Person p1 = new Person(25,"Prem");
        Person p2 = (Person) p1.clone();
        System.out.println(p1);
        System.out.println(p2);

        p2.setAge(27);
        p2.setName("Ravi");
        System.out.println(p2);
    }
}
