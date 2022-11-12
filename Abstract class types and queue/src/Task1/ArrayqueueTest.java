package Task1;

abstract class ArrayqueueTest {
    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue();
        q.dequeue();
        for (int i = 1; i < 6; i++) {
            q.enqueue(i);
        }
        q.enqueue(6);
        q.display();
        q.dequeue();
        q.display();
        q.element();
        q.size();
        q.clear();
    }
}