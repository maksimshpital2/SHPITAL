package Task1;

public class Demo {
    public static void main(String[] args) {
        System.out.println( 2 / 0 );
    }
}
    //программа даст сбой, и вы получите следующее сообщение
    // Exception in thread "main" java.lang.ArithmeticException: / by zero
    //at Demo.main(Demo.java:3)
    //Это говорит нам о том, что программа пытается выполнить деление на ноль, который он не в состоянии выполнить.

