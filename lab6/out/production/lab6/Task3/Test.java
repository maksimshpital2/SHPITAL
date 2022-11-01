public class Test implements Nameable {
    private String name;

    Test(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}