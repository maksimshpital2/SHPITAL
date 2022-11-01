public class Memory extends Computer {
    double capacity;

    public Memory(EnumComputer companyName, double cost, double capacity) {
        this.companyName = companyName;
        this.cost = cost;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "memory:{Capacity= " + capacity + '}';
    }
}