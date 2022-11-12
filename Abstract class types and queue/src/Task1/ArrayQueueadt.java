package Task1;

abstract class ArrayQueueadt {
    int SIZE;
    int[] items;
    int front, rear;

    abstract int getElement(int index);

    abstract boolean isFull();

    abstract boolean isEmpty();

    abstract void enqueue(int element);

    abstract int dequeue();

    abstract void element();

    abstract void size();

    abstract void clear();

    abstract void display();
}
