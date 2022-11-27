package Task1to3;

import java.util.Random;

abstract class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Hashtab<String, Integer> hashtab = new Hashtab<>();
        hashtab.hashtabAdd("Word", rand.nextInt(10));
        hashtab.hashtabAdd("Pirate", rand.nextInt(10));
        hashtab.hashtabAdd("Book", rand.nextInt(10));
        hashtab.hashtabAdd("World", rand.nextInt(10));
        hashtab.hashtabAdd("Apple", rand.nextInt(10));
        hashtab.hashtabAdd("Snow", 7);
        hashtab.hashtabAdd("Table", rand.nextInt(10));
        hashtab.hashtabAdd("Chair", rand.nextInt(10));
        hashtab.hashtabAdd("Screen", rand.nextInt(10));
        hashtab.hashtabAdd("School", rand.nextInt(10));
        hashtab.print();
        hashtab.hashtabDelete("Snow");
        hashtab.print();
        System.out.println(hashtab.hashtabLookup("School"));
        hashtab.clear();
    }
}
