package InterviewPrep.LearnJavaByImplementing.OOPS.PillarsOfOops.Encapsulation;

public class client {
    public static void main(String[] args) {
        Car c = new Car();
        c.setVehicleNumber("TN01 9998");
        System.out.println(c.getVehicleNumber());
        c.printCarNumber();
    }
}
