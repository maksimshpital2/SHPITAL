package Task1to3;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Stack;

class ListingIterator implements Iterator<Integer> {
    private List<Integer> list;
    private int index;
    private boolean removeCalled;

    ListingIterator(List<Integer> list) {
        this.list = list;
        index = 0;
        removeCalled = false;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Integer result = list.get(index);
        index++;
        return result;
    }

    @Override
    public void remove() {
        if (removeCalled) {
            throw new IllegalStateException("элемент уже убран");
        }
        if (index == 0) {
            throw new IllegalStateException("такого элемента нет");
        }
        index--;
        list.remove(index);
        removeCalled = true;
    }

    public void invert() {
        Stack<Integer> stack = new Stack<>();
        for (int i = list.size() - 1; i > 0; i--) {
            stack.push(list.get(i));
        }
        list = stack;
        System.out.println(stack);
    }
}
