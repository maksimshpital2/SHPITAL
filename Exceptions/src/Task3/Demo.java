package Task3;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        try{
            System.out.println(2/i);
        } catch ( Exception e ) {
            System.out.println("Error");
        }
    }
}
    //При вводе тех же значений, при 0 ошибка обрабатывается, при 1.2 не обрабатывается, при 1 ошибок нет
