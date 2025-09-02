package JavaFundamentals.OOPS.Inheritance;

public class Rectangle extends Shape{

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int length;
    int breadth ;


    @Override
    double calculateArea() {
        return length * breadth;
    }
}
