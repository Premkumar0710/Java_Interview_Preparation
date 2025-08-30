package InterviewPrep.LearnJavaByImplementing.OOPS.PillarsOfOops.Abstraction.Interfaces.BirdProblem;

public class Bird implements Flyable,Swimmable{
    @Override
    public void fly() {
        System.out.println("Bird's fly");
    }

    @Override
    public void swim() {
        System.out.println("Few Bird's can swim");
    }
}
