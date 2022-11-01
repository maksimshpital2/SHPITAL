public class Shop {
    private int space = 10;
    private int[] computer = new int[space];
    private int amount;

    Shop(int amount) {
        this.amount = amount;

        for (int i = 0; i < amount; i++) {
            computer[i] = 1;
        }
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void addComputer(int a) {
        if ((this.amount + a) > 10) {
            this.amount = 10;
        }
        this.amount += a;
    }

    public void delComputer(int a) {
        if ((this.amount - a) < 0) {
            this.amount = 0;
        }
        this.amount -= a;
    }

    public void findComputer(int a) {
        if (a < 0 || a > 10) {
            System.out.println("Error");
        } else if (computer[a] == 0) {
            System.out.println("Компьютера " + a + " нет в наличии");
        }
        System.out.println("Компьютер " + a + " есть на складе");
    }

    @Override
    public String toString() {
        return "{" + "В магазине: " + amount + " компьютеров}";
    }
}