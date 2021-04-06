package Operators;

public class UnaryOperators {
    public static void main(String... args){
        int b = 5;
        int loopiterations=0;
        while( --b > 0)
            loopiterations++;
        System.out.println("b: "+b+" loopiterations: "+ loopiterations);

        b = 5;
        int a = b--; // it assigns 'b' to 'a' first and then will decrement b by 1
        System.out.println(a); // 5

        b=5;
        a = --b; // it decrements first and then assigns b to a
        System.out.println(a); // 4

        b = 5;
        loopiterations=0;

        while( b-- > 0)
            loopiterations++;
        System.out.println("b: "+b+" loopiterations: "+ loopiterations);

        Short s = 10;
        //s = +s; // compiler error: required short found int +s promotes 's' to int type
        //short s1 = ~s; // compiler error: required short found int ~s promotes 's' to int type
        int s1 = ~s; //  -11 `formulae: (-s)-1` bitwise compliment operator
        System.out.println("bitwise compliment "+ s1);
        s1 = -s; // -10 unary minus operator negates sign
        System.out.println("unary minus "+ s1);
        s1 = +s; // 10 no change to 's' value so it returns same value as s
        System.out.println("unary plus "+ s1);

        s1 = 10;
        s1 = s1+++20; // 30 ++ has more precedence
        System.out.println(s1);
        a = 10;
        s1 =10;
        // Expression evaluates from left to right
        s1 = s1+++a+++s1++; // 31 - assign value first and then increment s1 assigns 10 in first addition and it will increment to 11
                            // in final addition it gets 11. 11 will be assigned and then it increments but the final result we are
                            // assigning back to `s1` so `s1` gets `31 (10+10+11)`.
        System.out.println(s1); // 31
        System.out.println(a); // 11

        s1 = 10;
        // Expression evaluates from left to right
        int s2 = s1---10+s1++; // 9
        System.out.println("s1 "+ s1); // 10
        System.out.println("s2 "+s2); // 9

        s1 = 10;
        // Expression evaluates from left to right
        s2 = s1++-10+s1--; // 11
        System.out.println("s1 "+ s1); // 10
        System.out.println("s2 "+s2); // 11
    }
}
