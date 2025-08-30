package InterviewPrep.LearnJavaByImplementing.OOPS.AccessModifiers.dummy;
import InterviewPrep.LearnJavaByImplementing.OOPS.AccessModifiers.demo.AccessModifiers;
public class client {
    public static void main(String[] args) {
        AccessModifiers a = new AccessModifiers();
        a.name1 = "Kumar"; // only public is visible here
    }
}
