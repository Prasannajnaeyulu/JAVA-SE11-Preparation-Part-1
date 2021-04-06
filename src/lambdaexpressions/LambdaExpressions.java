package lambdaexpressions;
import Operators.BinaryOperator2;

interface UnaryCalculator{
    int calculate(int a);
}

interface BinaryCalculator<T>{
    T calculate(T a, T b);
}

public class LambdaExpressions {
    public static void main(String... args){
        UnaryCalculator uc1 = a -> a + 1; // here a+1 is an expression. If your implementation is just has one expression,
                                          // we can omit the curly braces and return statement

        // compiler error: if lambda expression body is a statement you must enclose it in curly braces
//        UnaryCalculator uc2 = a -> return a + 1;

        //compiler error: operator + can't be applied to var and int
//        UnaryCalculator uc4 = (var a) -> a + 1;

        // we can specify type in parenthesis it is OK
        UnaryCalculator uc5 = (int a) -> a + 1;

        // It is OK now
        UnaryCalculator uc2 = a -> { return a + 1; };

        // we can omit the parenthesis if it is a single parameter; providing also OK no issues
        UnaryCalculator uc3 = (a) -> {
            if(a%3 == 0)
                return a;
            else return a-a%3;
        };

        System.out.println(calculate(10, uc1));
        System.out.println(calculate(10, uc2));
        System.out.println(calculate(10, uc3));

        BinaryCalculator<Integer> bc1 = (a, b) -> a + b;
        BinaryCalculator<Integer> bc2 = (Integer a, Integer b) -> a + b;
        BinaryCalculator<Float> bc3 = (Float a, Float b) -> a + b;

        System.out.println(calculate(10, 20, bc1));
        System.out.println(calculate(10, 20, bc2));
        System.out.println(calculate(10.0f, 20.0f, bc3));

        // compiler error: can't resolve method calculate(double, double, BinaryCalculator)
//        System.out.println(calculate(10.0, 20.0, bc3));

        //compiler error: parameter types specified in interface method are all same type so the lambda expression
        // should also contains parameters of same type
        // If the interface method declares different types then it is OK to use different types here..
//        BinaryCalculator<Float> bc3 = (Float a, int b) -> a + b;

        //compiler error: lambda expression with multiple parameters must enclose in parenthesis
//        BinaryCalculator<Float> bc3 = Float a, Float b -> a + b;

        // It is showing can't resolve symbol 'var' bit it is running fine
        // may be My JAVA 11 is not recognizing somehow
        BinaryCalculator bc7 = (var a, var b) -> { System.out.println(a+"a" + b); return 10; };
        System.out.println(bc7.calculate(10, 30));

        // interesting and weird: a function with void return type can have the following statement without curly braces
        Change a1 = (s) -> s = s + " World";
        changeIt("Hello", (s) -> s = s+" World");
    }

    interface Change{
        void change(String s);
    }

    static void changeIt(String s, Change c){
        c.change(s);
    }

    static int calculate(Integer a, UnaryCalculator uc){
        return uc.calculate(a);
    }

    static int calculate(int a, int b, BinaryCalculator bc){
        return (int)bc.calculate(a, b);
    }
    static float calculate(float a, float b, BinaryCalculator bc){
        return (float)bc.calculate(a, b);
    }
}