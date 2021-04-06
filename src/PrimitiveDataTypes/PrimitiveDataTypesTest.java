package PrimitiveDataTypes;

public class PrimitiveDataTypesTest {
    public static void main(String... args){
        byte b = 127;
        char c = 65;
        short s = 127;
        int i = 127;
        long l = 127;
        float f = 127;
        double d = 127;
        boolean bl = false;

        System.out.println("byte: "+ b);
        System.out.println("char: "+ c);
        System.out.println("short: "+ s);
        System.out.println("int: "+ i);
        System.out.println("long: "+ l);
        System.out.println("float: "+ f);
        System.out.println("double: "+ d);
        System.out.println("boolean: "+ bl);

        b = 127;
        c = '\u007F';
        s = 0123;
        i = 0x1234;
        l = 127l;
        f = 12.12e2f;
        d = 127e2d;
        bl = false;

        System.out.println("byte: "+ b);
        System.out.println("char: "+ c);
        System.out.println("short: "+ s);
        System.out.println("int: "+ i);
        System.out.println("long: "+ l);
        System.out.println("float: "+ f);
        System.out.println("double: "+ d);
        System.out.println("boolean: "+ bl);

        b = 0b0001;
        c = 'a';
        s = 0123;
        i = 0x1234;
        l = 127;
        f = 12e2f;
        d = 127e2;
        bl = false;

        System.out.println("byte: "+ b);
        System.out.println("char: "+ c);
        System.out.println("short: "+ s);
        System.out.println("int: "+ i);
        System.out.println("long: "+ l);
        System.out.println("float: "+ f);
        System.out.println("double: "+ d);
        System.out.println("boolean: "+ bl);

        b = 0b00_01; // java treat this as 0b0001
        c = 'a';
        s = 01_23; // java treat this as 0123
        i = 0x1_2_3_4; // java treat this as 0x1234
        l = 12_7; // java treat this as 127
        f = 1_2e2f; // java treat this as 12e2f
        d = 12_7e2_12; // java treat this as 127e212
        bl = false;

        System.out.println("byte: "+ b);
        System.out.println("char: "+ c);
        System.out.println("short: "+ s);
        System.out.println("int: "+ i);
        System.out.println("long: "+ l);
        System.out.println("float: "+ f);
        System.out.println("double: "+ d);
        System.out.println("boolean: "+ bl);

//        b = 0_b00_01; // underscore before 'b' not allowed
//        b = 0b_00_01; // underscore after 'b' not allowed
//        c = 65536; // out of range char is 16-bit and max value is 65535
//        s = 0_1_23; // java treat this as 0123
//        i = 0_x1_2_3_4; // underscore before 'x' not allowed
//        i = 0x_1_2_3_4; // underscore after 'x' not allowed
//        l = _12_7; // underscore before the literal is not allowed
//        l = 12_7_; // underscore at the end of the literal is not allowed
//        f = 1_2_e2f; // underscore before 'e' not allowed
//        d = 12_7e_2_12; // underscore after 'e' not allowed

//        bl = 0; // for boolean only accepted values are true and false

//        // null literal is not allowed to assign for primitive types
//        b = null;
//        c = null;
//        s = null;
//        i = null;
//        l = null;
//        f = null;
//        d = null;
//        bl = null;
    }
}

