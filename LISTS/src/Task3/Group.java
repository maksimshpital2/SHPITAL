package Task3;



public class Group {
    private static class Node {
        private Student data;
        Node nextNode;

        public Node(Student student) {
            data = student;
        }

        public void displayNode() {
            System.out.print(data + " ");
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

    private Node head = null;
    private Node tail = null;

    public void addNode(Student student) {
        Node newNode = new Node(student);

        if (head == null) {
            head = newNode;
        } else {
            tail.nextNode = newNode;
        }

        tail = newNode;
        tail.nextNode = head;
    }

    public boolean containsNode(Student student) {
        Node currentNode = head;

        if (head == null) {
            return false;
        } else {
            do {
                if (currentNode.data == student) {
                    return true;
                }
                currentNode = currentNode.nextNode;
            } while (!currentNode.equals(head));
            return false;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void traverseList() {
        Node currentNode = head;

        if (head != null) {
            do {
                currentNode = currentNode.nextNode;
                System.out.println(currentNode);
            } while (!currentNode.equals(head));
        }
    }

    public void deleteNode(Student student) {
        Node currentNode = head;
        if (head == null) {
            return;
        }
        do {
            Node nextNode = currentNode.nextNode;
            if (nextNode.data == student) {
                if (tail.equals(head)) {
                    head = null;
                    tail = null;
                } else {
                    currentNode.nextNode = nextNode.nextNode;
                    if (head.equals(nextNode)) {
                        head = head.nextNode;
                    }
                    if (tail.equals(nextNode)) {
                        tail = currentNode;
                    }
                }
                break;
            }
            currentNode = nextNode;
        } while (!currentNode.equals(head));
    }
}