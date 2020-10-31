
public class E extends D {
    protected String e;
    
    @Override
    public String toString() {
        var parentStr = super.toString();
        return parentStr.substring(0, parentStr.length() - 1) + ", e = " + e + ")";
    }
}
