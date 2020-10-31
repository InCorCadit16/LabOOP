
public class C extends B {
    protected String c;

    @Override
    public String toString() {
        var parentStr = super.toString();
        return parentStr.substring(0, parentStr.length() - 1) + ", c = " + c + ")";
    }
}
