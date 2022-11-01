public class Test implements Priceable {
    private int price;

    Test(int price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}