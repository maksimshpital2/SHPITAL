package Task7;

public class TestBook {
    public TestBook() {
    }

    public static void main(String[] args) {
        Book b1 = new Book("Николай Гоголь", "Мертвые души", 1842, 352);
        Book b2 = new Book("Luis R.D.", "RIP", 2020, 501);
        b1.toReadBook();
        b2.toReadBook();
        b1.ClearBook();
        b1.toReadBook();
        b2.toReadBook();
    }
}