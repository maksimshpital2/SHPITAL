package Task2;

public class ChairFactory implements AbstractChairFactory{
    private double age;

    ChairFactory(double age) {
        this.age = age;
    }
    public VictorianChair createVictorianChair(){
        return new VictorianChair(age);
    }
    public MagicChair createMagicChair(){
        return new MagicChair();
    }
    public FunctionalСhair createFunctionalСhair(){
        return new FunctionalСhair();
    }
}
