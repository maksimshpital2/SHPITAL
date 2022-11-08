package Task1;

public class ArrayQueuemodule {
    int element;

    ArrayQueuemodule(ArrayQueue queue, int index) {
        element = queue.getElement(index);
    }

    public int getElement() {
        return element;
    }
}