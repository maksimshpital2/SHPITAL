abstract class Main {
    public static void main(String[] strings) {
        StringBuilder buffer = new StringBuilder("sdf");
        OvservableString undoablestringbuilder = new OvservableString(buffer);
        undoablestringbuilder.setOnChangeListener(new MyListener());
        undoablestringbuilder.append(buffer, "Hello");
        undoablestringbuilder.append(buffer, ", ");
        undoablestringbuilder.append(buffer, "World!");
    }
}