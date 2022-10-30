package Task4;

import static java.lang.Math.atan;
import static java.lang.Math.pow;

public class MathFunc implements MathCalculable {
    private double x;
    private double y;
    private String num;

    public String getNum(){
        return num;
    }

    MathFunc(int x, int y) {
        this.x = x;
        this.y = y;
        this.num = x + " + i*" + y;
    }

    @Override
    public String exponentiation(int indicator) {
        return pow(this.module(), indicator) + "e^(i*" + atan(y / x) * indicator + ")";
    }

    @Override
    public double module() {
        return pow(x * x + y * y, 0.5);
    }
}
