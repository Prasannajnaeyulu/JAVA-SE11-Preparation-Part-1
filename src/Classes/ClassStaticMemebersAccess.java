package Classes;

class TestStatic {
    static String name = "Mary";

    public static String getName() {
        return name;
    }
}

public class ClassStaticMemebersAccess {
    public static void main(String[] args) {
        TestStatic t0 = new TestStatic();
        // interesting: You can also reference a static class member using a null object or just using the class name of the class
        TestStatic t1 = null;
        // the following is absolutely valid
        // we can access static variables or static methods with null type reference
        System.out.println(t1.name);
        t1.getName();
    }
}