public class F extends E {
    protected String f;
    
    @Override
    public String toString() {
        var parentStr = super.toString();
        return parentStr.substring(0, parentStr.length() - 1) + ", f = " + f + ")";
    }
}
