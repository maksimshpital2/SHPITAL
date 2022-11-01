
public class Monitor extends Computer {
    int framerate;
    double size;

    public Monitor(EnumComputer companyName, double cost, int framerate, double size) {
        this.companyName = companyName;
        this.cost = cost;
        this.framerate = framerate;
        this.size = size;
    }

    @Override
    public String toString() {
        return "memory:{Framerate= " + framerate + "Size=" + size + '}';
    }
}