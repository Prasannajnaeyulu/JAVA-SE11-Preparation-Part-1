package LocalVariableTypeInference;

import java.util.ArrayList;

/*
  Local variable Type inference is introduced in Java 10 to reduce verbosity of a code
  Only applies to local variables inside a method body
  Can Not apply for class static/non-static instance variables
 */
public class VarExample {
    // compiler error: can't resolve symbol 'r' as it is not applicable at class level static or non-static instance variables
//    static var a = 20;
//    var k = 20;
    public static void main(String... args){
        // very verbose we can use LVTI (Local variable type inference to reduce this verbosity)
//        LocalVariableTypeInference.com.awordycompany.AWordyCompany wordyCompany =
//                new LocalVariableTypeInference.com.awordycompany.AWordyCompany();

        var wordyCompany = new LocalVariableTypeInference.com.awordycompany.AWordyCompany();
        wordyCompany.greeting();

        // It is OK
        var i = 10;
        System.out.print(i);

        // compiler error: 'var' is not allowed in a compound declaration
//        var i=0, j=10;

        //compiler error: can't infer type: 'var' on variable without initializer
//        var i;

        // compiler error: array initialization is not allowed here
        // Note: we can't initialize array by referring with 'var'
//        var a = {10, 20};

        // compiler error: can't infer type: 'var' initializer is null
//        var a = null;

        // It is OK as var o1 infer to type Object
        Object o = null;
        var o1 = o;

        // It is OK
        var i1 = new int[]{10, 20};

        // It is OK var here infer to the type ArrayList
        var j = new ArrayList<>();

        // compiler error: c\an't have array of var; it should be single var always
//        var[] i2 = new int[]{2,3};

        //compiler error: 'var' is a restricted local variable type and cannot be used for type declarations
//        class var{}
//        interface var{}
//        enum var{}
    }
    // compiler error: can't resolve the symbol 'var'
    // var is only applicable inside method body
//    void add(var a){
//    }

    // compiler error: 'var' is not allowed here
    // same rule var is not applicable to method return types
//    var greeting(String message){
//        var x = message;
//        return x;
//    }
}
