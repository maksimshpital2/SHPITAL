abstract class Main {
    public static void main(String[] args) {
        Employer employer = new Manager("fsdf", "asf", 23, 124);
        System.out.println(employer);
        Employer[] a = new Employer[2];
        a[0] = new Employer("������", "�������", 1736);
        a[1] = new Manager("�������", "��������", 1736, 3872);
        a[0].getIncome();
        a[1].getIncome();
    }
}