package Task4;

public class MinMax<T> {
    private T[] arr;
    private int size;

    MinMax(T[] arr1) {
        arr = arr1;
    }

    public int getSize() {
        return size;
    }

    public T[] getArr() {
        return arr;
    }

    public void setArr(T[] arr) {
        this.arr = arr;
    }

    public T min() {
        T min = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if ((Integer) arr[i] > (Integer) arr[i + 1]) {
                min = arr[i + 1];
            }
        }
        return min;
    }

    public T max() {
        T max = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if ((Integer) arr[i] < (Integer) arr[i + 1]) {
                max = arr[i + 1];
            }
        }
        return max;
    }
}
