package Task2;

abstract class AbstractQueue {
    abstract int getSIZE();

    abstract boolean isEmpty();

    abstract void size();

    abstract int getElement(int index);

    abstract void enqueue(int element);

    abstract int dequeue();

    abstract void element();

    abstract void clear();
}