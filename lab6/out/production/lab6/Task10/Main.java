
abstract class Main {
    public static void main(String[] args) {
        Computer a = new Computer(EnumComputer.Apple, 8000, new Processor(EnumComputer.Apple, 2000, 5,
                7, 96), new Memory(EnumComputer.Samsung, 256, 13),
                new Monitor(EnumComputer.Apple, 19653, 20, 168));
        System.out.println(a);
    }
}