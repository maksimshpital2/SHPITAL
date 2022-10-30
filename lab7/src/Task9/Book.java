package Task9;

public class Book implements Printable {
    public static void printBooks(Printable[] printable) {
        for (int i = 0; i < printable.length; i++) {
            System.out.println(printable[i] instanceof Book);
        }
    }

    @Override
    public void print() {
        System.out.println("something");
    }
}
