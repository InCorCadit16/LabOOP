public class I extends H {
    protected String i;

    @Override
    public String toString() {
        var parentStr = super.toString();
        return parentStr.substring(0, parentStr.length() - 1) + ", i = " + i + ")";
    }
}
