package Task1to3;

public class Node<K, V> {
    private K key;
    private V value;
    private Node<K, V> next;
    private Node<K, V> prev;

    public Node(K key, V value) {
        this.key = key;
        this.value = value;
        next = null;
        prev = null;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public V setValue(V value) {
        this.value = value;
        return value;
    }

    public Node<K, V> getPrev() {
        return prev;
    }

    public void setPrev(Node<K, V> prev) {
        this.prev = prev;
    }

    public Node<K, V> getNext() {
        return next;
    }

    public void setNext(Node<K, V> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        String result = "{\"" + this.key + "\": \"" + this.value + "\"}";
        if (this.next != null) {
            result += ", ";
            result += this.next.toString();
        }
        return result;
    }
}
