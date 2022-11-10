package Task1;

abstract class Tester {
    public static void main(String[] args) {
        Student student = new Student("v", "zsehg", "seg", 3, "aarg");
        Student student1 = new Student("zshb", "zsdehg", "sdzneg", 124, "aasgzrg");
        Group group = new Group(student, student1);
        System.out.println(group.isEmpty());
        group.add(student);
        group.delete(0);
        group.print();
        group.clear();
    }
}
