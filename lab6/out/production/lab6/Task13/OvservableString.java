class OvservableString {
    private StringBuild onChangeListener;
    private String string;

    public String getString() {
        return string;
    }

    public void setOnChangeListener(StringBuild onChangeListener) {
        this.onChangeListener = onChangeListener;
    }

    public OvservableString(StringBuilder buffer) {
        string = String.valueOf(buffer);
    }

    private void notifyOnStringBuilderChangeListener() {
        if (onChangeListener != null) {
            onChangeListener.onChange(this);
        }
    }

    public OvservableString append(StringBuilder buffer, Object obj) {
        buffer.append(obj);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public OvservableString replace(StringBuilder buffer, int start, int end, String str) {
        buffer.replace(start, end, str);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    public OvservableString insert(StringBuilder buffer, int index, char[] str, int offset, int len) {
        buffer.insert(index, str, offset, len);
        notifyOnStringBuilderChangeListener();
        return this;
    }

    @Override
    public String toString() {
        return " ";
    }
}