package Task1;

import java.io.FileReader;
import java.io.IOException;

abstract class Main {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("C:\\Users\\ProPc\\IdeaProjects\\algorithm-forkedd\\students"
                + "\\21K0673\\21K0673-p31\\src\\main\\java\\ru\\mirea\\practice\\work1\\PROCS.txt")) {
            int c;
            Tree23 tree = new Tree23();
            while ((c = reader.read()) != -1) {
                System.out.println((char) c);
                tree.root = tree.insert(tree.root, (char) c);
            }
            System.out.println("\n");
            tree.print(tree.root);
            tree.root = tree.deleteNode(tree.root, 10);
            System.out.println("\n");
            tree.print(tree.root);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
