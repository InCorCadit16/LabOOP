import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Comparator;

public class A {
    protected String a;
    protected X x = new X("xxx");

    public A(String a, X x) {
        this.a = a;
        this.x = x;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " ( a = " + a + ", x.value = " + x.getX() + ")";
    }

    // Works only when all fields are public
    // @Override
    // public String toString()  {
    //     StringBuilder builder = new StringBuilder(this.getClass().getSimpleName());
    //     builder.append(": \n(");
    //     try {
    //         var arr = this.getClass().getFields();
    //         Arrays.sort(arr, new Comparator<Field>(){
    //             @Override
    //             public int compare(Field o1, Field o2) {
    //                 return o1.getName().charAt(0) > o2.getName().charAt(0) ? 1 : -1;
    //             }
    //         });

    //         for (Field f : arr) {
    //             builder.append(f.getName())
    //             .append(": ")
    //             .append(f.get(this))
    //             .append(", ");
    //         }
    //         builder.deleteCharAt(builder.length() - 2);
    //     } catch (SecurityException| IllegalAccessException e) {
    //         return super.toString();
    //     }
        
    //     builder.append(")\n");
    //     return builder.toString();
    // }
}
