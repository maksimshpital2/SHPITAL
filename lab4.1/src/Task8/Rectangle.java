public abstract class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length, double width, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    Rectangle(double side, String color, boolean filled) {
        super(color, filled);
        this.length = side;
        this.width = side;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public String toString() {
        return "Rectangle:{Side length = " + length + "Side b = " + width + ", Area = " + (length * width)
                + ", Perimeter = " + (2 * length + 2 * width) + "}";
    }
}