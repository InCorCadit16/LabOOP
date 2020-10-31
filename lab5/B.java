
public class B extends A {
    protected String b;


    public B() {
        super("B test", new X("bx"));
    }

    @Override
    public String toString() {
        var parentStr = super.toString();
        return parentStr.substring(0, parentStr.length() - 1) + ", b = " + b + ")";
    }
}
