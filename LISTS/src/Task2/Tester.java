package Task2;

abstract class Tester {
    public static void main(String[] args) {
        Group newList = new Group();
        newList.addFirst(new Student("v", "zsehg", "seg", 3, "aarg"));
        newList.addFirst(new Student("vrey", "zerysehg", "seeryg", 23, "aadfhrg"));
        newList.displayList();
        newList.removeFirst();
        newList.removeLast();
        newList.displayList();
        newList.isEmpty();
    }
}
