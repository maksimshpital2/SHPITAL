package Task2;

public class VictorianChair implements Chair {
    private double age;

    public double getAge() {
        return age;
    }

    VictorianChair(double age) {
        this.age = age;
    }

    @Override
    public void getMaterial() {
        System.out.println("Wood");
    }
}