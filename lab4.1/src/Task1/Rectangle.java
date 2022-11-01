public class Rectangle extends Shape {
    private double a;
    private double b;

    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String getType() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return 2 * a + 2 * b;
    }

    @Override
    public String toString() {
        return "Rectangle:{Side a = " + a + "Side b = " + b + ", Area = " + (a * b) + ", Perimeter = " + (2 * a + 2 * b) + "}";
    }
}