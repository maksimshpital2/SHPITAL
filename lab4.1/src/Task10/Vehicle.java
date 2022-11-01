public abstract class Vehicle {
    protected double time;
    protected double price;

    Vehicle(double time, double price) {
        this.price = price;
        this.time = time;
    }

    public double getTime() {
        return time;
    }

    public double getPrice() {
        return price;
    }
}