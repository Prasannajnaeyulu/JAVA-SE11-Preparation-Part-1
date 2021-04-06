package Strings;

public class StringQuiz {
    // run like java -cp production\JAVA-SE11-Preparation Strings.StringQuiz hello
    public static void main(String... args) {  //  Line 1

        String hello="hello";

        for (var arg: args) {  // Line 2
            StringBuilder sb = new StringBuilder(arg); // Line 3
            System.out.print(arg.equals(sb) +" ");  // Line 4 // false
            System.out.print( (hello.equals(arg)) +" ");  // Line 5 //true
            System.out.println( (hello==arg)); // Line 6 //false

            String s = new String(arg); // Line 3
            System.out.print(arg.equals(s) +" ");  // Line 4 // true
            System.out.print( (hello.equals(arg)) +" ");  // Line 5 //true
            // intern() method refers arg value from string constant pool
            // If already exists it uses that one here we already created "hello" in Line#7 above hence it is ==
            System.out.println( (hello==arg.intern())); // Line 6 //true
            // strange main(String[]) in StringQuiz2 can't be applied to main()
//            StringQuiz2.main();
            // It is OK
            StringQuiz2.main(null);
        }
    }
}


class StringQuiz2 {

    static String s;
    public static void main(String[] args) {

        String s;
        boolean isOk=true;
        if (isOk) s = StringQuiz2.s+"";  // Line 1 // concatenating null to "" gives -> "null" string
        else s="";
        s.concat("Hello ");  // Line 2 concat works but not assigning the value back to string so no change to 's'
        s.concat("World"); // concat works but not assigning the value back to string so no change to 's'
        s.toUpperCase(); // upperCase works but not assigning the value back to string so no change to 's'
        System.out.println("s = "+s); // output: "s = null"

    }
}