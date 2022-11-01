public abstract class Circle extends Shape {
    private double r;

    Circle(double r, String color, boolean filled) {
        super(color, filled);
        this.r = r;
    }

    public double getRadius() {
        return this.r;
    }

    public void setRadius(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return 3.14 * r * r;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * r;
    }

    @Override
    public String toString() {
        return "Circle:{Radius = " + r + ", Area = " + (3.14 * r * r) + ", Perimeter = " + (2 * 3.14 * r) + "}";
    }
}