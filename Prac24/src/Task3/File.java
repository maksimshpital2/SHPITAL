package Task3;

public class File {
    private Create create;

    public void New(String string) {
        create.CreateNew(string);
    }

    public void Open(String string) {
        create.CreateOpen(string);
    }

    public void Save() {
        System.out.println("Файлы сохранены");
    }

    public void Exit() {
        System.out.println("Теперь вы можете открыть другой файл");
    }

}
