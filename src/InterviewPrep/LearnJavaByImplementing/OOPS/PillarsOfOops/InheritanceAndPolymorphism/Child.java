package InterviewPrep.LearnJavaByImplementing.OOPS.PillarsOfOops.InheritanceAndPolymorphism;

public class Child extends Parent{
int age = 3;
String name = "Baby";

@Override
    public void work(){
    System.out.println("I am a baby; i have no work");
}
}
