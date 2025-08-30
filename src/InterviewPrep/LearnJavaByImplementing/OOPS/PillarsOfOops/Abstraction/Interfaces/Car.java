package InterviewPrep.LearnJavaByImplementing.OOPS.PillarsOfOops.Abstraction.Interfaces;

public class Car implements Vehicle{


    @Override
    public void start() {
        System.out.println("Car starts at a speed of " + max_speed); // CAR Cannot override max_speed as its private & final
    }

    @Override
    public void stop() {

    }
}
