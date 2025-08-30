package InterviewPrep.LearnJavaByImplementing.OOPS.AccessModifiers.demo;

public class Client {
    public static void main(String[] args) {
        AccessModifiers am = new AccessModifiers();
        //    d.name = "Prem"; not possible -> private (only inside same class)
        am.name1 = "Prem"; // possible from everywhere -> public
        am.name2 = "Kumar";
        am.name3 = "PremKumar";
        System.out.println(am.name1 + " " + am.name2 + " " + am.name3);
    }
}
