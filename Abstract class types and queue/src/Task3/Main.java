package Task3;

abstract class Main {
    public static void main(String[] args) {
        new Subtract(new Multiply(new Const(2), new Variable("x")), new Const(3)).evaluate(5);
        new Add(new Subtract(new Multiply(new Variable("x"), new Variable("x")), new Multiply(new Const(2), new Variable("x"))), new Const(1)).evaluate(0);
    }
}
