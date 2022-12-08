package Task1;

import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Algorithm {
    public static int maximum(int n, int[] array, boolean[] f) {
        int k = -1;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (!f[i]) {
                if (i > 0 && array[i] > array[i - 1] && array[i] > max) {
                    k = i;
                    max = array[i];
                }
            } else {
                if (i < n - 1 && array[i] > array[i + 1] && array[i] > max) {
                    k = i;
                    max = array[i];
                }
            }
        }
        return k;
    }

    public static int[] swap(int[] array, boolean[] f, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        boolean temp1 = f[i];
        f[i] = f[j];
        f[j] = temp1;
        return array;
    }

    public static boolean[] reverse(int[] array, int k, boolean[] f) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > array[k]) {
                f[i] = !f[i];
            }
        }
        return f;
    }

    public static void algor(int n) {
        boolean[] flag = new boolean[n];
        int[] idata = new int[n];
        for (int i = 0; i < n; i++) {
            idata[i] = i + 1;
            flag[i] = false;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(idata[i]);
            System.out.print(" ");
        }
        System.out.println();
        int k = 0;
        k = maximum(n, idata, flag);
        while (k != -1) {
            if (flag[k]) {
                swap(idata, flag, k, k + 1);
                k++;
            } else {
                swap(idata, flag, k, k - 1);
                k--;
            }
            reverse(idata, k, flag);
            for (int i = 0; i < n; i++) {
                System.out.print(idata[i]);
                System.out.print(" ");
            }
            System.out.println();
            k = maximum(n, idata, flag);
        }
    }

    public static void main(String[] args) {
        System.out.print("Введите кол-во переменных: ");
        Scanner scan = new Scanner(System.in);
        try {
            int n = scan.nextInt();
            algor(n);
            scan.close();
        } catch (InputMismatchException e) {
            System.out.println("Error");
            scan.nextInt();
        } finally {
            scan.close();
        }
    }
}