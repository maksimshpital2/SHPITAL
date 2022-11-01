public class Convertion implements Convertable {
    private double value;

    Convertion(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public void convert(double value, boolean marker) {
        if (marker) {
            System.out.print("\n����������� � ����������� = ");
            System.out.print(value *= 33.8);
        } else {
            System.out.print("\n����������� � ��������� = ");
            System.out.print(value *= 274.15);
        }
    }
}