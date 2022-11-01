public abstract class Shape {
    protected String color;
    protected boolean filled;

    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public abstract String getColor();

    public abstract void setColor(String color);

    public abstract boolean isFilled();

    public abstract void setFilled(boolean filled);

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public abstract String toString();
}