package Task1;

public class Demo2 {
    public static void main(String[] args) {
        try{
            System.out.println( 2/0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
    }
}

//Программа обработает ошибку и выдаст следующее сообщение:
// Attempted division by zero