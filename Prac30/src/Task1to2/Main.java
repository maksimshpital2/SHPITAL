package Task1to2;

abstract class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        for (int i = 0; i < 4; i++) {
            tree.insert(i);
        }
        tree.print();
        tree.delete(2);
        tree.print();
        tree.delete(0);
        tree.delete(1);
        tree.delete(3);
        tree.print();
    }
}