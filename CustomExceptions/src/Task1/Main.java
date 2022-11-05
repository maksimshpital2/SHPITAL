package Task1;

import java.util.Scanner;

abstract class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Work work = new Work(" ", " ");
            //123456789012
            System.out.println("Введите ФИО");
            work.setFullname(scanner.next());

            System.out.println("Введите ИНН");
            try {
                work.setInn();
            } catch (InnisWrongexception e) {
                System.out.println(e.getMessage());
            }
        } catch (Exception e) {
            System.out.println(" ");
        } finally {
            scanner.close();
        }
    }
}