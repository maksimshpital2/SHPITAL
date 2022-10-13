package Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Summ {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[5];
        int sum = 0;
        int i = 0;

        do {
            list[i] = Integer.parseInt(reader.readLine());
            sum += list[i];
            ++i;
        } while (i < 5);

        int min = list[0];
        int max = list[0];

        for (int j = 1; j != list.length; j++) {
            if (list[j] < min) {
                min = list[j];
            }

            if (list[j] > max) {
                max = list[j];
            }
        }

        System.out.println(min);
        System.out.println(max);
    }
}
