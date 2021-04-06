package Scopes;

public class ClassScopes {
    // It is OK.
    static int z=10;

    public static void main(String... args){
        // compiler error: modifier 'static' is not allowed here
        // static only applicable to class level variables not method level variables
//        static int k = 20;
        // compiler error: modifier 'public' is not allowed here
//        public int k1=30;
        // compiler error: modifier 'private' is not allowed here
//        private int k2=40;
        // compiler error: modifier 'protected' is not allowed here
//        protected int k3=40;

        Person p1 = new Person();
        System.out.println(p1);

        Person p2 =  new Person(25, "charlie");
        System.out.println(p2);

        Person p3 =  new Person(35);
        System.out.println(p3);
        int i =10;
        class Person{
            // compiler error: inner classes can't have static declaration
//            static int k= 20;

            {
                int j;
                // j is declared above so declaring again in for loop throws compiler error
                // int i=0, j=0 actually treats like creating two new int variables
//                for (int i = 0, j=0; i < 2; i++, j++) {
//                    System.out.println("hello " + i);
//                }

                // This is OK. Because here only int i is created. Where as j is assigned a value '0' first and then j is assigned to i
                // So it is ok
                for (int i= j=0; i < 2; i++, j++) {
                    System.out.println("hello " + i+ j);
               }
                // compiler error: accessing variable 'i' of outer class should be final or effectively final
                // as we are incrementing i in this for loop, it breaks final rules hence compiler error here
//                for (i = j=0; i < 2; i++, j++) {
//                    System.out.println("hello " + i+ j);
//                }

                // here we just accessed 'i' but no increment in the for loop so it is OK.
                // But if we increment 'i' anywhere in this inner or outer class it is a violation to final
                // So we get the compiler error; see I incremented in line#44 outside this inner class and it throws
                // compiler error here => variable 'i' accessed from within inner class should be final or effectively final
//                for (j=i; j < 20; j++) {
//                    System.out.println("hello " + i+ j);
//                }

            }
        }

        new Person(); // it uses inner Person class and executes the instance block code
        i++; // Above 'i' is accessed in an inner class hence any increments would cause compiler errors in inner class lines
        //variable used in lambda expression should be final or effectively final
        // compiler error: here variable 'i' is not final or not effectively final because it is changed in quite few places so compiler throws error
//        () -> i+=2;
    }
}
