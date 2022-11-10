package Task3;

abstract class Main {
    public static void main(String[] args) {
        File file = new File();
        file.New("Text.txt");
        file.Open("Text.txt");
        file.Save();
        file.Exit();
    }
}
