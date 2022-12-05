package Task1to2;

public class HuffmanTree {
    private final byte SIZE = 127;
    private String string;
    private Tree tree;
    private int[] arr;
    private String[] strings;

    public HuffmanTree(String string, Tree tree) {
        this.string = string;
        arr = new int[SIZE];
        fillFrequenceArray();
        this.tree = tree;
        strings = new String[SIZE];
        fillEncodingArray(tree.getRoot(), "", "");
    }

    private void fillFrequenceArray() {
        for (int i = 0; i < string.length(); i++) {
            arr[(int) string.charAt(i)]++;
        }
    }

    public int[] getFrequenceArray() {
        return arr;
    }

    public Tree getTree() {
        return tree;
    }

    void fillEncodingArray(Node node, String codeBefore, String direction) {
        if (node.getRight() == null & node.getLeft() == null) {
            strings[node.getValue()] = codeBefore + direction;
        } else {
            fillEncodingArray(node.getLeft(), codeBefore + direction, "0");
            fillEncodingArray(node.getRight(), codeBefore + direction, "1");
        }
    }

    String[] getStrings() {
        return strings;
    }

    public void displayEncodingArray() {
        fillEncodingArray(tree.getRoot(), "", "");
        System.out.println("======================Encoding table====================");
        for (int i = 0; i < SIZE; i++) {
            if (arr[i] != 0) {
                System.out.print((char) i + " ");
                System.out.println(strings[i]);
            }
        }
        System.out.println("========================================================");
    }

    String getString() {
        return string;
    }
}
