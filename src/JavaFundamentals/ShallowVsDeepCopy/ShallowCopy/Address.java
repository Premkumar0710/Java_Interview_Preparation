package JavaFundamentals.ShallowVsDeepCopy.ShallowCopy;

public class Address {

    public void setCity(String city) {
        this.city = city;
    }

    private String city;

    public Address(String city){
        this.city = city;
    }

    public String getCity() {
        return city;
    }

}
