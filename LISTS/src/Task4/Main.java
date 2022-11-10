package Task4;


abstract class Main {
    public static void main(String[] args) {
        DoublyLinked<String> list = new DoublyLinked<>();
        if (list.isEmpty()) {
            if (list.size() == 0) {
                System.out.println("Check");
            }
        }
        list.addFront("bol");
        System.out.println(list);
        list.addFront("aa");
        System.out.println(list);
        list.addFront("bol");
        System.out.println(list);
        list.remove("water");
        System.out.println(list);
    }
}