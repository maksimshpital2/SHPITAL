public class Square extends Shape {
    private double a;

    Square(double a) {
        this.a = a;
    }

    @Override
    public String getType() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
        return a * a;
    }

    @Override
    public double getPerimeter() {
        return a * 4;
    }

    @Override
    public String toString() {
        return "Rectangle:{Side a = " + a + ", Area = " + (a * a) + ", Perimeter = " + (a * 4) + "}";
    }
}