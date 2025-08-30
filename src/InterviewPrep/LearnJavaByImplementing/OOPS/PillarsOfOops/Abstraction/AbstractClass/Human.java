package InterviewPrep.LearnJavaByImplementing.OOPS.PillarsOfOops.Abstraction.AbstractClass;

public abstract class Human {
    int age;
    String gender;
    static int counter = 0;

//    public abstract void birth(){
//        System.out.println("Its mandatory to be implemented");
//    }                -> Abstract method cannot have body
    public abstract void work();
    public abstract void eat();
    public abstract void sleep();
    final void birth(){
        System.out.println("Birth should be must");
    }

}
