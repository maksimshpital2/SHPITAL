package Task1;

import java.util.Stack;

public class Tree {
    private Node node;

    public Tree() {
        node = null;
    }

    public Node findbyValue(int value) {
        Node node = this.node;
        while (node.getValue() != value) {
            if (value < node.getValue()) {
                node = node.getLeft();
            } else {
                node = node.getRight();
            }
            if (node == null) {
                return null;
            }
        }
        return node;
    }

    public void insert(int value) {
        Node node = new Node();
        node.setValue(value);
        if (this.node == null) {
            this.node = node;
        } else {
            Node root = this.node;
            Node parent;
            while (true) {
                parent = root;
                if (value == root.getValue()) {
                    return;
                } else if (value < root.getValue()) {
                    root = root.getLeft();
                    if (root == null) {
                        parent.setLeft(node);
                        return;
                    }
                } else {
                    root = root.getRight();
                    if (root == null) {
                        parent.setRight(node);
                        return;
                    }
                }
            }
        }
    }

    public boolean delete(int value) {
        Node root = this.node;
        Node parent = this.node;
        boolean isleft = true;
        while (root.getValue() != value) {
            parent = root;
            if (value < root.getValue()) {
                isleft = true;
                root = root.getLeft();
            } else {
                isleft = false;
                root = root.getRight();
            }
            if (root == null) {
                return false;
            }
        }
        if (root.getLeft() == null && root.getRight() == null) {
            if (root == this.node) {
                this.node = null;
            } else if (isleft) {
                parent.setLeft(null);
            } else {
                parent.setRight(null);
            }
        } else if (root.getRight() == null) {
            if (root == this.node) {
                this.node = root.getLeft();
            } else if (isleft) {
                parent.setLeft(root.getLeft());
            } else {
                parent.setRight(root.getLeft());
            }
        } else if (root.getLeft() == null) {
            if (root == this.node) {
                this.node = root.getRight();
            } else if (isleft) {
                parent.setLeft(root.getRight());
            } else {
                parent.setRight(root.getRight());
            }
        } else {
            Node heir = lookup(root);
            if (root == this.node) {
                this.node = heir;
            } else if (isleft) {
                parent.setLeft(heir);
            } else {
                parent.setRight(heir);
            }
        }
        return true;
    }

    private Node lookup(Node node) {
        Node parent = node;
        Node look = node;
        Node root = node.getRight();
        while (root != null) {
            parent = look;
            look = root;
            root = root.getLeft();
        }
        if (look != node.getRight()) {
            parent.setLeft(look.getRight());
            look.setRight(node.getRight());
        }
        return look;
    }

    public void print() {
        Stack globalStack = new Stack();
        globalStack.push(node);
        int gaps = 32;
        boolean isRowEmpty = false;
        String separator = "-----------------------------------------------------------------";
        System.out.println(separator);
        while (isRowEmpty == false) {
            Stack localStack = new Stack();
            isRowEmpty = true;
            for (int j = 0; j < gaps; j++) {
                System.out.print(' ');
            }
            while (globalStack.isEmpty() == false) {
                Node temp = (Node) globalStack.pop();
                if (temp != null) {
                    System.out.print(temp.getValue());
                    localStack.push(temp.getLeft());
                    localStack.push(temp.getRight());
                    if (temp.getLeft() != null || temp.getRight() != null) {
                        isRowEmpty = false;
                    }
                } else {
                    System.out.print("__");
                    localStack.push(null);
                    localStack.push(null);
                }
                for (int j = 0; j < gaps * 2 - 2; j++) {
                    System.out.print(' ');
                }
            }
            System.out.println();
            gaps /= 2;
            while (localStack.isEmpty() == false) {
                globalStack.push(localStack.pop());
            }
        }
        System.out.println(separator);
    }

    public void size() {
        int amount = 0;
        Stack globalStack = new Stack();
        globalStack.push(node);
        int gaps = 32;
        boolean isRowEmpty = false;
        while (!isRowEmpty) {
            Stack localStack = new Stack();
            isRowEmpty = true;
            while (!globalStack.isEmpty()) {
                Node temp = (Node) globalStack.pop();
                if (temp != null) {
                    amount++;
                    localStack.push(temp.getLeft());
                    localStack.push(temp.getRight());
                    if (temp.getLeft() != null || temp.getRight() != null) {
                        isRowEmpty = false;
                    }
                } else {
                    localStack.push(null);
                    localStack.push(null);
                }
            }
            gaps /= 2;
            while (localStack.isEmpty() == false) {
                globalStack.push(localStack.pop());
            }
        }
        System.out.println(amount);
    }

    public int height(Node node) {
        int h1 = 0;
        int h2 = 0;
        if (node == null) {
            return 0;
        }
        if (node.getLeft() != null) {
            h1 = height(node.getLeft());
        }
        if (node.getRight() != null) {
            h2 = height(node.getRight());
        }
        return Math.max(h1, h2) + 1;
    }

    void reverse(Node node) {
        if (node != null) {
            if (node.getLeft() != null & node.getRight() != null) {
                Node buff = node.getLeft();
                node.setLeft(node.getRight());
                node.setLeft(buff);
                reverse(node.getLeft());
                reverse(node.getRight());
            } else if (node.getLeft() != null & node.getRight() == null) {
                reverse(node.getLeft());
            } else if (node.getLeft() == null & node.getRight() != null) {
                reverse(node.getRight());
            }
        }
    }

    int getMaxWidth(Node node) {
        int maxWdth = 0;
        int i;
        int width = 0;
        int h = height(this.node);
        for (i = 1; i < h; i++) {
            width = getWidth(this.node, i);
            if (width > maxWdth) {
                maxWdth = width;
            }
        }
        return maxWdth;
    }

    int getWidth(Node node, int level) {
        if (node == null) {
            return 0;
        }
        if (level == 1) {
            return 1;
        } else if (level > 1) {
            return getWidth(node.getLeft(), level - 1) + getWidth(node.getRight(), level - 1);
        }
        getWidth(node.getRight(), level - 1);
        return 0;
    }

    boolean sameTree(Node node1, Node node2) {
        if (node1 == null & node2 == null) {
            return true;
        } else if (node1 != null && node2 != null) {
            return (node1.getValue() == node2.getValue()) & sameTree(node1.getLeft(),
                    node2.getLeft()) & sameTree(node1.getRight(), node2.getRight());
        } else {
            return false;
        }
    }
}
