package Task4;

public class DoublyLinked<String> {
    private ListNode<String> front;
    private int size;

    public DoublyLinked() {
        front = null;
    }

    public void compare(String string) {
        ListNode<String> current = front; //буферный узел
        boolean bool = false; //буферная переменная для постановки перед или за первым элементом
        int s = 0; //буферная переменная для завершения цикла и не добавления элемента, если он уже был добавлен
        for (int i = -1; i < string.toString().length(); ) { //цикл, определяющий, куда, относительно первого элемента необходимо поставить строку
            for (int j = 0; j < current.data.toString().length(); j++) {
                i++;
                if (string.toString().charAt(i) < current.data.toString().charAt(j) | (string.toString().charAt(i) == current.data.toString().charAt(j) & string.toString().length() < current.data.toString().length() & i == string.toString().length() - 1)) {
                    bool = true;
                    s = 1;
                    break;
                } else if (string.toString().charAt(i) > current.data.toString().charAt(j) | (string.toString().charAt(i) == current.data.toString().charAt(j) & string.toString().length() > current.data.toString().length() & j == current.data.toString().length() - 1)) {
                    s = 1;
                    break;
                }
            }
            if (s == 1) {
                s = 0;
                break;
            }
        }
        if (bool) {
            addBefore(current.data, string);
            size--;
            s = 1;
        } else {
            addAfter(current.data, string);
            size--;
        }
        while (current.next != null) { //цикл для не первых элементов
            if (string.toString().charAt(0) >= current.data.toString().charAt(0)) {
                if (string == current.data) {
                    break;
                }
                current = current.next;
            } else {
                break;
            }
        }
        if (s == 0) {
            addAfter(current.data, string);
            if (string == current.data) { //убираем лишние элементы, если поставились
                remove(current.data);
            } else if (string == current.prev.data) {
                remove(current.prev.data);
            }
        }
        size--;
    }

    public void addFront(String string) {
        if (isEmpty()) {
            front = new ListNode<>(string);
        } else {
            compare(string);
        }
        size++;
    }

    public void addAfter(String x, String y) {
        if (isEmpty()) {
            System.out.println("Элемент " + x.toString() + " не найден");
        } else {
            ListNode<String> current = front;
            while (current != null && !current.data.equals(x)) {
                current = current.next;
            }
            if (current == null) {
                System.out.println("Элемент " + x.toString() + " не найден");
            } else {
                ListNode<String> newNode = new ListNode<>(current, y, current.next);
                if (current.next != null) {
                    current.next.prev = newNode;
                }
                current.next = newNode;
            }
        }
        size++;
    }

    public void addBefore(String x, String y) {
        if (isEmpty()) {
            System.out.println("Элемент " + x.toString() + " не найден");
        } else {
            ListNode<String> current = front;
            while (current != null && !current.data.equals(x)) {
                current = current.next;
            }
            if (current == null) {
                System.out.println("Элемент " + x.toString() + " не найден");
            } else {
                ListNode<String> newNode = new ListNode<>(current.prev, y, current);
                if (current.prev != null) {
                    current.prev.next = newNode;
                } else {
                    front = newNode;
                }
                current.prev = newNode;
                size++;
            }
        }
    }

    public void remove(String x) {
        if (isEmpty()) {
            System.out.println("Элемент " + x.toString() + " не найден");
        } else {
            if (front.data.equals(x)) {
                front = front.next;
                return;
            }
            ListNode<String> current = front;
            while (current != null && !current.data.equals(x)) {
                current = current.next;
            }
            if (current == null) {
                System.out.println("Элемент " + x.toString() + " не найден");
            } else {
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                current.prev.next = current.next;
            }
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    @Override
    public java.lang.String toString() {
        ListNode<String> temp = front;
        StringBuilder builder = new StringBuilder("[");
        while (temp != null) {
            builder.append(temp.data).append(",");
            temp = temp.next;
        }
        builder.deleteCharAt(builder.length() - 1);
        builder.append("]");
        return builder.toString();
    }
}
