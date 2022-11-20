package Task1to3;

import java.util.ArrayList;

abstract class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            arr.add(i);
        }
        Listing listing = new Listing(arr);
        ListingIterator iterator = (ListingIterator) listing.iterator();
        iterator.invert();
    }
}
