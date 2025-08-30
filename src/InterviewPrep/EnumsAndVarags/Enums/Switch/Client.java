package InterviewPrep.EnumsAndVarags.Enums.Switch;

public class Client {

    public static void main(String[] args) {

        Role r = Role.GUEST;

        switch (r){
            case ADMIN -> System.out.println("Admin is here");
            case GUEST -> System.out.println("Guest is here");
            case USER -> System.out.println("User is here");
            default-> System.out.println("Unknown user");
                // no need of break if we use arrow (->)
        }
    }
}
