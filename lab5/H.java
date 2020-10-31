
public class H extends G {
    protected String h;
    private X x = new X("dxd");

    @Override
    public String toString() {
        var parentStr = super.toString();
        return parentStr.substring(0, parentStr.length() - 1) + ", h = " + h + ")";
    }
}
