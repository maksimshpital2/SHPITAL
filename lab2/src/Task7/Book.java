package Task7;

public class Book {
    private String ah;
    private String name;
    private int yer;
    private int str;

    public Book(String ah, String name, int yer, int str) {
        this.ah = ah;
        this.name = name;
        this.yer = yer;
        this.str = str;
    }

    public void toReadBook() {
        System.out.println("Автор:" + this.ah + " Книга:\"" + this.name + "\" Год написания:" + this.yer + " Страниц:" + this.str + "\n");
    }

    public void ClearBook() {
        System.out.println("Идёт отчистка данных о книге: \"" + this.name + "\"\n");
        this.ah = "--Clear--";
        this.name = "--Clear--";
        this.yer = 0;
        this.str = 0;
    }
}

