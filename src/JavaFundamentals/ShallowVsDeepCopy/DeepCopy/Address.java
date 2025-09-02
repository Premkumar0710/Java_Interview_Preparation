package JavaFundamentals.ShallowVsDeepCopy.DeepCopy;

public class Address {
    private String city;

    public Address(String city){
        this.city = city;
    }

    // Copy constructor for deep copy
    public Address(Address other) {
        this.city = other.city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
