package Task5;

public class TestDog {
    public TestDog() {
    }

    public static void main(String[] args) {
        Shepherd d1 = new Shepherd("Rex", "Black", 6, 45);
        Dachshund d2 = new Dachshund("Sosiska", "Red", 4, 77);
        ChihuaHua d3 = new ChihuaHua("Lexus", "Black", 3, 89);
        d1.WhatItIsADod();
        d2.WhatItIsADod();
        d3.WhatItIsADod();
    }
}