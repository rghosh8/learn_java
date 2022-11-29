public abstract class Shape implements Comparable<Shape> {
    @Override
    public int compareTo(Shape other) {
        return Double.compare(this.getArea(), other.getArea());
    }
    public abstract double getArea();

    public String toString() {
        return this.getClass().getName() + " with area = " + this.getArea();
    }

}
