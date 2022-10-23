package Task2;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        System.out.println( 2/i );
    }
}
    //При вводе 0 выдаст следующую ошибку:
    // Enter an integer 0
    // Exception in thread "main" java.lang.ArithmeticException: / by zero at Demo.main(Demo.java:9)
    // Что говорит нам что делить на 0 нельзя
    // При вводе 1.2 выдает следующие ошибки:
    // Enter an integer 1.2
    // Exception in thread "main" java.lang.NumberFormatException: For input string: "1.2"
    // at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
    // at java.base/java.lang.Integer.parseInt(Integer.java:652)
    // at java.base/java.lang.Integer.parseInt(Integer.java:770)
    // at Demo.main(Demo.java:8)
    // Что говорит нам что введение число не является целым, ошибку не обрабатывает
    // При вводе 1 программа выполниться без ошибок

