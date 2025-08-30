package InterviewPrep.LearnJavaByImplementing.OOPS.PillarsOfOops.Abstraction.AbstractClass;

public class Client {
    public static void main(String[] args) {
        Worker w = new Worker();
        System.out.println(w.age);
        System.out.println(w.gender);
        w.eat();
        w.sleep();
        w.work();
        System.out.println(w.counter);
    }
}
