package Task1;

abstract class arrayqueuemoduleTest {
    public static void main(String[] args) {
        ArrayQueue q = new ArrayQueue();
        q.dequeue();
        for (int i = 1; i < 6; i++) {
            q.enqueue(i);
        }
        ArrayQueuemodule element = new ArrayQueuemodule(q, 3);
        System.out.println(element.getElement());
    }
}
