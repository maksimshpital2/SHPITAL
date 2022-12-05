package Task1to2;

public class Node {
    private int value;
    private Node left;
    private Node right;

    public void print() {
        System.out.println(" Значение на узле:" + value);
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return this.left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return this.right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" + "value=" + value + ", leftChild=" + left + ", rightChild=" + right + '}';
    }
}