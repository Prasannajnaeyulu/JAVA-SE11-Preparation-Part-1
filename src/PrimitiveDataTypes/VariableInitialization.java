package PrimitiveDataTypes;

public class VariableInitialization {
    public static void main(String... args){
        // It is ok to declare the local variables without initialization
        // But if we try to refer(access) then we get compile time error
//        byte b;
//        char c;
//        short s;
//        int i;
//        long l;
//        float f;
//        double d;
//        boolean bl;
//
//        // accessing uninitialized local variables is an error
//        // variable might not have been initialized
//        System.out.println("byte: "+ b);
//        System.out.println("char: "+ c);
//        System.out.println("short: "+ s);
//        System.out.println("int: "+ i);
//        System.out.println("long: "+ l);
//        System.out.println("float: "+ f);
//        System.out.println("double: "+ d);
//        System.out.println("boolean: "+ bl);

//        int q; // uninitialized local variable
//        // as it is always true statically a always been initialized
//        if(true){
//            q = 10;
//        }
//        // a is initialized in the above if
//        System.out.println(a);

//        int x, y=10; // uninitialized local variable 'x'
//        // 'x' initialized in if condition only so never guaranteed to be initialized fully
//        // partial initialization of a variable is a compiler error
//        if(y < 20){
//            x = 20;
//        }
//
//        System.out.println(x); //accessing partially initialized local variable compile error
//        System.out.println(y);
//
//        int z; // uninitialized local variable
//        while(true){
//            z=10;
//        }
//        // z is statically initialized in the above while loop so is always true hence compiler is OK
//        System.out.println(z);


//       int u,v=0;
//       while(v<1){
//           u=20;
//       }
//
//        System.out.println(u); // compiler error uninitialized local variable
//        System.out.println(v);

        int k;
        // k would always have been initialized as do while runs at least once
        do{
            k=20;
            break;
        }while(k>1);

//        System.out.println(k); // it is ok as 'do while' make sure k is initialized
//        int m=10, n;
//        switch(m){
//            case 0:
//            case 1:
//            case 2:
//                n = 2;
//            case 3:
//            case 4:
//            case 5:
//                n = 5;
//        }
//
//        System.out.println(n); // compiler error n might not have been initialized

        int m=10, n;
        switch(m){
            case 0:
            case 1:
            case 2:
                n = 2;
            case 3:
            case 4:
            case 5:
                n = 5;
            default:
                n=10;
        }
        System.out.println(n); // It is ok as 'n' is guaranteed the initialization in above switch case

//        int i;
//        try{
//            i=0;
//        }
//        catch(Exception e){
//        }
        // compiler error: variable 'i' might not have been initialized
//        System.out.println("i: "+ i);

//        int i;
//        try{
//            i=0;
//        }
//        catch(Exception e){
//            i=0;
//        }
//        finally{
            // compiler error: variable 'i' might not have been initialized
//            System.out.println(i);
//        }
    }
}
