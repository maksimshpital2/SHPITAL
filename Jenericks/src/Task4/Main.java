package Task4;

abstract class Main {

    public static void main(String[] args) {
        Integer[] arr1 = new Integer[3];
        arr1[0] = 26;
        arr1[1] = 12;
        arr1[2] = -3;
        MinMax<Integer> arr = new MinMax<>(arr1);
        System.out.println(arr.min());
        System.out.println(arr.max());
    }
}
