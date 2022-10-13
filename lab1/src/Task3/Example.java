package Task3;

public class Example {
    public static void main(String[] args) {
        int[] number = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        int midleArif;
        for (midleArif = 0; midleArif < number.length; midleArif++) {
            sum += number[midleArif];
        }

        midleArif = sum / number.length;
        System.out.println(midleArif);
    }
}
