package Task8;

public class Magazine implements Printable {
    public static void printMagazines(Printable[] printable) {
        for (int i = 0; i < printable.length; i++) {
            System.out.println(printable[i] instanceof Magazine);
        }
    }

    @Override
    public void print() {
        System.out.println("something");
    }
}
