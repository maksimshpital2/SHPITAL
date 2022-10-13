package Task2;

public class TestBall {
    public TestBall() {
    }

    public static void main(String[] args) {
        Ball b1 = new Ball(100.0, 100.0);
        System.out.println(b1);
        b1.move(50.0, 55.0);
        System.out.println(b1);
    }
}
