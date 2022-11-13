package Task4;

abstract class Calculator {
    public static <T> Integer sum(T e, T e1) {
        return (Integer) e + (Integer) e1;
    }

    public static <T> Integer multiply(T e, T e1) {
        return (Integer) e * (Integer) e1;
    }

    public static <T> Integer divide(T e, T e1) {
        return (Integer) e / (Integer) e1;
    }

    public static <T> Integer subtraction(T e, T e1) {
        return (Integer) e - (Integer) e1;
    }
}
