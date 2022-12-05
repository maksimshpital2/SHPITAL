package HashSet;

import java.util.TreeSet;

abstract class HashSet {
    public static void main(String[] args) {
        java.util.HashSet<String> set = new java.util.HashSet<>();
        set.add("word");
        set.add("not");
        set.add("agh");
        set.add("reh");
        System.out.println(set);
        TreeSet<String> treeset = new TreeSet<>(set);
        System.out.println(treeset);
    }
}