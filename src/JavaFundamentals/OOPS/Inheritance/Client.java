package JavaFundamentals.OOPS.Inheritance;

public class Client {
    public static void main(String[] args) {

        Shape []shapes = new Shape[2];
        shapes[0] = new Circle(2.3);
        shapes[1] = new Rectangle(4,5);

        for(Shape s : shapes){
            System.out.println("Area : " + s.calculateArea());
        }
    }
}
