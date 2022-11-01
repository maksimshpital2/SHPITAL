abstract class Tester {
    private final int a;
    private final Circle[] arr;

    Tester(int a, Circle[] arr) {
        this.a = a;
        this.arr = arr;
    }

    @Override
    public String toString() {
        return "a:" + a + "arr:" + arr[0];
    }

    public static void main(String[] args) {
        Point b = new Point(35, 24);
        Circle a = new Circle(b, 56);

        System.out.println(a);
        System.out.println(b.getX());
        System.out.println(b.getY());
        b.setX(234);
        b.setY(324);
        b.setXY(24, 45);
        System.out.println(a.getR());
        System.out.println(a.getCenter());
        a.setR(23);
        a.setCenter(b);
        a.setXY(b, 234);
    }
}