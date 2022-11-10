package Task2;

public class Group {
    private static class Node {
        private Student data;
        private Node next;
        private Node prev;

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

    public Node first = null;
    public Node last = null;

    public void addFirst(Student student) {
        Node newnode = new Node(student);
        if (isEmpty()) {
            newnode.next = null;
            newnode.prev = null;
            first = newnode;
            last = newnode;

        } else {
            first.prev = newnode;
            newnode.next = first;
            newnode.prev = null;
            first = newnode;
        }
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void displayList() {
        Node current = first;
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    public void removeFirst() {
        if (!isEmpty()) {
            Node temp = first;

            if (first.next == null) {
                first = null;
                last = null;
            } else {
                first = first.next;
                first.prev = null;
            }
            System.out.println(temp);
        }
    }

    public void removeLast() {
        Node temp = last;

        if (!isEmpty()) {

            if (first.next == null) {
                first = null;
                last = null;
            } else {
                last = last.prev;
                last.next = null;
            }
        }
        System.out.println(temp.toString());
    }
}
