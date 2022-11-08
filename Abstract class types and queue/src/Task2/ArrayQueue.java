package Task2;

public class ArrayQueue {
    private int SIZE = 5;
    private int[] items = new int[SIZE];
    private int front, rear;

    ArrayQueue() {
        front = -1;
        rear = -1;
    }

    public int getSIZE() {
        return SIZE;
    }

    public int getElement(int index) {
        return items[index];
    }

    public boolean isFull() {
        return front == 0 && rear == SIZE - 1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            items[rear] = element;
            System.out.println("Insert " + element);
        }
    }

    public int dequeue() {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        } else {
            element = items[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println(element + "Deleted");
            return (element);
        }
    }

    public void element() {
        System.out.println("Первый элемент в очереди -> " + items[0]);
    }

    public void size() {
        System.out.println("Размер очереди -> " + items.length);
    }

    public void clear() {
        System.out.println("Очередь очищена");
        items = new int[0];
    }

    public void display() {
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("\nFront index-> " + front);
            System.out.println("Items -> ");
            for (i = front; i <= rear; i++) {
                System.out.print(items[i] + " ");
            }
            System.out.println("\nRear index-> " + rear);
        }
    }
}
