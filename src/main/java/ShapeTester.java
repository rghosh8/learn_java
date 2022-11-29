public class ShapeTester {
    public static void main(String[] args) {
        Shape s0 = new Circle();
        Shape s1 = new Circle(10);

        Shape s2 = new Rectangle();
        Shape s3 = new Rectangle(10, 45);

        Shape s4 = new Square();
        Shape s5 = new Square(10);

        Shape s6 = new Triangle();
        Shape s7 = new Triangle(10, 20);

        Shape[] shapes = {s0, s1, s2, s3, s4, s5, s6, s7};

        for (Shape shape: shapes) {
            System.out.println(shape);
        }
    }
}
