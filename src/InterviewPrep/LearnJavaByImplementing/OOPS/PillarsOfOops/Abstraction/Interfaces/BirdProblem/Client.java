package InterviewPrep.LearnJavaByImplementing.OOPS.PillarsOfOops.Abstraction.Interfaces.BirdProblem;

public class Client {

    public static void main(String[] args) {
        // Polymorphic reference
        Flyable f = new Bird();
        f.fly();
        Swimmable s = new Bird();
        s.swim();

        // Class reference
        Bird b = new Bird();
        b.fly();
        b.swim();
    }
}
