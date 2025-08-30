package InterviewPrep.EnumsAndVarags;

public enum UserRoles {
    ADMIN("Whole access") , USER("Partial access") , GUEST("No access");

    String Description;

    UserRoles(String Description){
        this.Description = Description;
    }

    public String getDescription() {
        return Description;
    }


    @Override
    public String toString() {
        return "UserRoles{" +
                "Description='" + Description + '\'' +
                '}';
    }

}
