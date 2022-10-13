package ru.mirea.lab3.MathRandom;

public class Circle extends Point implements Comparable {
    private double radius;

    public Circle() {
        super(0, 0);
        this.radius = 1.0;
    }

    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    public double getSquare() {
        return Math.pow(this.radius, 2.0) * 3.14;
    }

    public double circleLong() {
        return 2.0 * this.radius * 3.14;
    }

    public String toString() {
        int var10000 = super.getX();
        return "X: " + var10000 + "\nY: " + super.getY() + "\nRadius: " + this.radius + "\n";
    }

    public int compareTo(Object o) {
        Circle c = (Circle)o;
        return Double.compare(this.getSquare(), c.getSquare());
    }
}
