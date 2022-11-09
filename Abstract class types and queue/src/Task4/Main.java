package Task4;

abstract class Main {
    public static void main(String[] args) {
        ExpressionParser parser=new ExpressionParser();
        parser.TripleExpressionparse("x * (y - 2)*z + 1");
    }
}
