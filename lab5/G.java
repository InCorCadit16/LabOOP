public class G extends F {
    protected String g;

    @Override
    public String toString() {
        var parentStr = super.toString();
        return parentStr.substring(0, parentStr.length() - 1) + ", g = " + g + ")";
    }
}
