
class Lab5 {

    public static void main(String[] args) {
        A[] arr = new A[] { new A("test", new X("x test")), new B(), new C(), new D(), new E(), new F(), new G(), new H(), new I(), new J() };

        
        for (A a: arr) {
            System.out.println(a.getClass().cast(a));
        }

        System.out.println(arr[9]);
    }    
}
