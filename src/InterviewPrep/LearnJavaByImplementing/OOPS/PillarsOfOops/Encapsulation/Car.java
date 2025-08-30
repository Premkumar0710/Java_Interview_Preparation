package InterviewPrep.LearnJavaByImplementing.OOPS.PillarsOfOops.Encapsulation;

public class Car {
    public String Carmodel;
    public String brand;
    private String vehicleNumber;

    public Car(){

    }

    // getters & setters for private variable
    public String getVehicleNumber(){
        return vehicleNumber;
    }
    public void setVehicleNumber(String vehicleNumber){
        this.vehicleNumber = vehicleNumber;
    }

    // methods
    public void printCarNumber(){
        System.out.println(vehicleNumber);
    }
}
