
public class D extends C {
    protected String d;
    protected X x = new X("dxd");

    @Override
    public String toString() {
        var parentStr = super.toString();
        return parentStr.substring(0, parentStr.length() - 1) + ", d = " + d + ")";
    }
}
