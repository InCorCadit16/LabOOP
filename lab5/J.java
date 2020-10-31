public class J extends I {
    protected String j;

    @Override
    public String toString() {
        var parentStr = super.toString();
        return parentStr.substring(0, parentStr.length() - 1) + ", j = " + j + ")";
    }
}
