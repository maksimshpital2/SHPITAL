package Task3to4;

abstract class Main {
    public static void main(String[] args) {
        new Subtract(new Multiply(new Const(2), new Variable("x")), new Const(3)).evaluate(5);
        new Add(new Subtract(new Multiply(new Variable("x"), new Variable("x")), new Multiply(new Const(2), new Variable("x"))), new Const(1)).evaluate(0);
        ExpressionParser parser = new ExpressionParser();
        parser.TripleExpressionparse("x *       ( y - 2 )   / z +        1", 1, 2, 3);
        String str = "1000000 * x * x * x * x * x / ( x - 1 )";
        parser.TripleExpressionparse(str, 0);
        parser.TripleExpressionparse(str, 1);
        parser.TripleExpressionparse(str, 2);
        parser.TripleExpressionparse(str, 3);
        parser.TripleExpressionparse(str, 4);
        parser.TripleExpressionparse(str, 5);
        parser.TripleExpressionparse(str, 6);
        parser.TripleExpressionparse(str, 7);
        parser.TripleExpressionparse(str, 8);
        parser.TripleExpressionparse(str, 9);
        parser.TripleExpressionparse(str, 10);
    }
}
