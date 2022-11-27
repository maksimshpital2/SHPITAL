package Task1;

import java.util.HashSet;
import java.util.TreeSet;

abstract class Hashset {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("word");
        set.add("not");
        set.add("agh");
        set.add("reh");
        System.out.println(set);
        TreeSet<String> treeset = new TreeSet<>(set);
        System.out.println(treeset);
    }
}