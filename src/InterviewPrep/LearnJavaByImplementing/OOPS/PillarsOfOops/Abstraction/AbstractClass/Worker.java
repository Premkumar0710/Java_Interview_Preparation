package InterviewPrep.LearnJavaByImplementing.OOPS.PillarsOfOops.Abstraction.AbstractClass;

public class Worker extends Human{

    int age = 25;
    String gender = "male";
    int counter = 5;
    @Override
    public void work() {
        System.out.println("Works for 9 hrs");
    }

    @Override
    public void eat() {
        System.out.println("eats for 1/2 hrs");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeps for 9 hrs");
    }

}
