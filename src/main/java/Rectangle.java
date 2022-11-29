public class Rectangle extends Shape{

    private double length;
    private double width;

    public Rectangle() {
        this(5, 12);
    }
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}
