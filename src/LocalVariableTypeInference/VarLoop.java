package LocalVariableTypeInference;

public class VarLoop {
    // keyword 'var' can be used for other variable names except for type declarations like
    // class, interface and enum names can't be named as 'var'
    public static void main(String... var){
        var a = var; // var here is a string array from main method args

        // var can be used in enhanced for loop as long as the types are inferred
        for(var string: var){
            System.out.println(string);
        }

        // var can be initialized to int literal so it is ok
        for(var i=0; i<5;i++){
            System.out.println(i);
        }

        short s1 = 10;
        // here +s1 widens the type to int so s2 type would be 'int'
        // Note: +s1 doesn't increment the value
        var s2 = +s1;
        System.out.println("s1: "+ s1); //10
        System.out.println("s2: "+ s2); //10
        System.out.println("s1 type: "+((Object)s1).getClass().getSimpleName()); // Short
        System.out.println("s2 type: "+((Object)s2).getClass().getSimpleName()); // Integer
    }
}
