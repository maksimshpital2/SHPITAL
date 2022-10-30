package Task5to6;

abstract class Main {
    public static void main(String[] args) {
        ProcessStrings processStrings = new ProcessStrings("apple");
        System.out.println(processStrings.symbols());
        System.out.println(processStrings.refactor());
        System.out.println(processStrings.invert());
    }
}
