package Methods;

/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 7: Creating and Using Methods
Topic: Create Methods and Constructors

*/

//Note: except primitives and String type variables all other references passed to the method call if any changes made to
// these references content it is reflected in calling place as well after the function is returned
public class TestPassByValue {
    public static void main(String[] args) {

        // Set up some test data

        // Primitive data variables
        int a = 1;
        int b = 2;

        // String variables
        String aString = new String("123");
        String bString = new String("456");

        // Object variables using StringBuilder
        StringBuilder abc = new StringBuilder("abc");
        StringBuilder def = new StringBuilder("def");

        System.out.println("-------- Before method call --------");

        // Print out values and hashcodes prior to method call
        System.out.println("abc.hashCode() = " + abc.hashCode()
                + ", value = " + abc);
        System.out.println("def.hashCode() = " + def.hashCode()
                + ", value = " + def);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("aString.hashCode() = " + aString.hashCode() +
                ", value = " + aString);
        System.out.println("bString.hashCode() = " + bString.hashCode() +
                ", value = " + bString);

        // Execute method on each type of data
        changeValue(a, b);
        changeValue(aString, bString);
        changeValue(abc, def);

        System.out.println("-------- After method call --------");

        // Print out values and hashcodes after the method call
        // interesting: notice primitives and String types hashcodes are same and their values also not changed
        // But StringBuilder hashcode is same but values gets changed because it is passed by reference any changes in
        // the function will reflect the content in the object
        System.out.println("abc.hashCode() = " + abc.hashCode() +
                ", value = " + abc);
        System.out.println("def.hashCode() = " + def.hashCode() +
                ", value = " + def);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("aString.hashCode() = " + aString.hashCode() +
                ", value = " + aString);
        System.out.println("bString.hashCode() = " + bString.hashCode() +
                ", value = " + bString);

    }

    public static void changeValue(Object o1, Object o2) {

        // This code changes the values of the parameters passed to it.
        switch (o1.getClass().getName()) {
            case ("java.lang.Integer"):
                o1 = 10;
                o2 = 20;
                break;
            case ("java.lang.String"):
                o1 = "aaaa";
                o2 = "bbbb";
                break;
            case ("java.lang.StringBuilder"):
                o1 = ((StringBuilder) o1).append("xyz");
                o2 = ((StringBuilder) o2).append("zzz");

                break;
        }
    }

}
