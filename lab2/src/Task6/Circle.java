package Task6;

public class Circle extends Shape {
    protected double radius;

    public Circle() {
        this.filled = false;
        this.color = "blue";
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.filled = false;
        this.color = "blue";
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
        return 6.283185307179586 * this.radius;
    }

    public String toString() {
        return "Shape: circle, radius: " + this.radius + ", color: " + this.color;
    }
}
