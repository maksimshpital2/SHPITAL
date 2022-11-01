import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Tester {
    public static void main(String[] args) {
        Shop sh = new Shop(8);

        System.out.println(sh);

        Scanner scanner = new Scanner(System.in);
        try {
            int a;
            System.out.print("¬ведите номер компьютера (1-10): ");
            a = scanner.nextInt();

            sh.findComputer(a);
            sh.addComputer(4);
            sh.delComputer(5);
            sh.findComputer(10);
            System.out.println(sh.getAmount());
            sh.setAmount(4);
        } catch (InputMismatchException e) {
            System.out.println("Error");
            scanner.nextInt();
        } finally {
            scanner.close();
        }
    }
}