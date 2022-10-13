package Task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        System.out.println(getFactorial(number));
    }

    public static int getFactorial(int number) {
        int factorial = 1;

        for (int i = number; i >= 1; i--) {
            factorial *= i;
        }

        return factorial;
    }
}
