package ru.mirea.lab3.wrapper;

public class Test {
    public static void main(String[] args) {

        Double double1 = Double.valueOf("14");
        System.out.println(double1);

        String text = "12.34";
        double string1 = Double.parseDouble(text);
        System.out.println(string1);

        double a = 123;
        byte b = (byte) a;
        int c = (int) a;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        String d = Double.toString(3.14);
        System.out.println(d);
    }
}

