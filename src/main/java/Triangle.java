public class Triangle extends Shape {

    private double height;
    private double base;

    public Triangle() {
        this(2,4);
    }

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double getArea() {
        return 0.5 * this.base * this.height;
    }
}
