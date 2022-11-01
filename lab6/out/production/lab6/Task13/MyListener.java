class MyListener implements StringBuild {
    @Override
    public void onChange(OvservableString stringBuilder) {
        System.out.println("CHANGED: " + stringBuilder.toString());
    }
}