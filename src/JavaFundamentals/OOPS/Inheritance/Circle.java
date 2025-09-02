package JavaFundamentals.OOPS.Inheritance;

public class Circle extends Shape{

    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    // key note : we cannot change the parameter (signature) or the return type of overriden method. We can just implement it in a different way. that's all
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}
