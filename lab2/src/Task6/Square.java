package Task6;

import java.util.Scanner;

public class Square extends Rectangle {
    double side;

    Square() {
        this.side = 1.0;
    }

    Square(double side) {
        this.side = side;
    }

    Square(double side, String color, boolean filled) {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        Scanner scan = new Scanner(System.in);
        side = (double)scan.nextInt();
    }

    public double getArea() {
        return this.side;
    }

    public double getPerimeter() {
        return this.side;
    }

    public String toString() {
        return "Shape: Square, side: " + this.side + ", color: " + this.color;
    }

    public double getLength() {
        return this.length;
    }
}
