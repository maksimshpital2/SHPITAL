package Task5to8;

public class Main {
    public void method() {
        System.out.println("a");
    }

    public static void main(String[] args) throws Exception {
        try {
            ThrowsDemo thr = new ThrowsDemo();
            thr.getDetails(null);
            thr.printMessage(null);
            thr.printDetails("");
            thr.getKey();
        } catch (Exception exception) {
            System.out.println("Error");
        }
    }
}