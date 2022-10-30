package Task4;

abstract class Main {
    public static void main(String[] args) {
        MathCalculable a = new MathFunc(3, 4);
        System.out.println(a.module());
        System.out.println(a.exponentiation(3));
    }
}