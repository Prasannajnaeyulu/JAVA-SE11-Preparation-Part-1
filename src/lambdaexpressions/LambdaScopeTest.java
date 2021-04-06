package lambdaexpressions;

import java.util.function.Consumer;
import java.util.function.Supplier;

//Reference: https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html#syntax
public class LambdaScopeTest {

    public int x = 0;

    class FirstLevel {

        public int x = 1;

        void methodInFirstLevel(int x) {

            // The following statement causes the compiler to generate
            // the error "local variables referenced from a lambda expression
            // must be final or effectively final" in statement A:
            //
             //x = 99;

            Consumer<Integer> myConsumer = (y) ->
            {
                // 'x' here refers to outer scope i.e., x in methodInFirstLevel function parameter
                // Note: x should be final or effectively final as this x is not changed anywhere in methodInFirstLevel
                // function it is accepted otherwise it throws compiler error
                System.out.println("x = " + x); // 23 Statement A
                System.out.println("y = " + y); // 23
                System.out.println("this.x = " + this.x); // 1; it refers to instance variable 'x' in class FirstLevel
                // Just like inheritance, Any instance or static variable of current class which hides the variable of its parent,
                // parent variable and child variable are part of the instance.
                // but the variable is referred based on the type of the instance
                // here we are accessing 'x' with LambdaScopeTest type so it refers to parent 'x' which is 0
                System.out.println("LambdaScopeTest.this.x = " +
                        LambdaScopeTest.this.x); // 0; it refers to x in LambdaScopeTest
            };

            myConsumer.accept(x);

            Supplier<String> stringSupplier = () -> "Hello World";
            System.out.println(stringSupplier.get());

//            System.out.println(factorydefault());

//            System.out.println(factory2());
        }

        public String factorydefault(){
            return "Hello default";
        }

        public String factory2(Supplier<? extends CharSequence> sb){
            return sb.get().toString();
        }
    }

    public static void main(String... args) {
        LambdaScopeTest st = new LambdaScopeTest();
        LambdaScopeTest.FirstLevel fl = st.new FirstLevel();
        fl.methodInFirstLevel(23);
    }
}
