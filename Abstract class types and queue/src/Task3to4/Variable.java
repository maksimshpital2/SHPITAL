package Task3to4;

public class Variable {
    private String var;

    public Variable(String var) {
        this.var = var;
    }

    public void setVar(String var) {
        this.var = var;
    }

    public String getVar() {
        return var;
    }

    @Override
    public String toString() {
        return var + "";
    }
}
