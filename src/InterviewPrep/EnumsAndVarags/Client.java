package InterviewPrep.EnumsAndVarags;

public class Client {

    public static void main(String[] args) {
        for(UserRoles u : UserRoles.values()){
            System.out.println(u.toString() + "- " + u.Description);
        }
    }
}
