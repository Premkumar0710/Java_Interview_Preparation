package InterviewPrep.LearnJavaByImplementing.Strings;

public class Client {
    public static void main(String[] args) {
        String name = "Prem"; // stored in string pool
        System.out.println(name.hashCode());
        name = "Prem kumar"; // stored in different address
        System.out.println(name.hashCode());

        String surname = "Prem kumar";
        System.out.println(name==surname); // doesn't create new object refrences to the old object itself
        System.out.println(name.equals(surname));

        StringBuilder sb = new StringBuilder("Hi all");
        System.out.println(sb);
        System.out.println(sb.toString());
        System.out.println(sb.hashCode());
        System.out.println(sb.append(" everyone"));
        System.out.println(sb.hashCode());
        sb.replace(0,sb.length(),"Hello all , Hi everyone");
        System.out.println(sb);
        System.out.println(sb.hashCode());
    }
}
