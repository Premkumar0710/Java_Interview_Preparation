package InterviewPrep.LearnJavaByImplementing.OOPS.PillarsOfOops.InheritanceAndPolymorphism;

public class Client {

    public static void main(String[] args) {
        System.out.println("Below are child's reference with child object");
        Child c = new Child();
        System.out.println(c.age); // before assigning age to child , it takes parent's age
        c.age = 2; // it's given as 3 there , I'm overriding with 2
        System.out.println(c.age);
        c.work();

        System.out.println("Below are parent's reference with parent object");
        Parent p = new Parent();
        System.out.println(p.age);
        p.age = 52;
        System.out.println(p.age);
        p.work();

        System.out.println("Below are parent's reference with child's object");
        Parent p1 = new Child();
        System.out.println(p1.age); // hidden
        System.out.println(p1.name); // hidden
        p1.age = c.age;
        System.out.println(p1.age); // assigning dada age with baby age
        p1.work(); // overriden

    }
}
