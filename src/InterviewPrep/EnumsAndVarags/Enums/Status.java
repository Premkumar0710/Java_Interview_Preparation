package InterviewPrep.EnumsAndVarags.Enums;

public enum Status {
    SUCCESS(200), UNAUTHORIZED(401), FAILURE(500);

    private int code;

    Status(int code){
        this.code = code;
    }

    public int getCode() {
        return code;
    }


}

