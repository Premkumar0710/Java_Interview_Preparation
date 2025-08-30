package InterviewPrep.EnumsAndVarags.Enums;

public class Client {
    public static void main(String[] args) {
        Status s = Status.FAILURE;
        System.out.println(s);
        int code = Status.FAILURE.getCode();
        System.out.println(code);
    }
}
