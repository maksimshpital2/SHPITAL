package Task3;

import java.util.Hashtable;

abstract class Test {
    public static void main(String[] args) {
        Hashtable<Double, Double> table = new Hashtable<>();
        table.put(1.3, 2.4);
        System.out.println(table);
    }
}
