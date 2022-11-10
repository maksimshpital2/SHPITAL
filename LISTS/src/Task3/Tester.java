package Task3;

abstract class Tester {
    public static void main(String[] args) {
        Group newList = new Group();
        newList.addNode(new Student("v", "zsehg", "seg", 3, "aarg"));
        newList.addNode(new Student("vrey", "zerysehg", "seeryg", 23, "aadfhrg"));
        newList.traverseList();
        newList.deleteNode(new Student("vrey", "zerysehg", "seeryg", 23, "aadfhrg"));
        newList.traverseList();
        newList.isEmpty();
    }
}
