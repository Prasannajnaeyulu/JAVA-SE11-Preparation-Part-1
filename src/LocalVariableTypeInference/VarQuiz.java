package LocalVariableTypeInference;

public class VarQuiz {
    static float tax_rate =0.06F;
    public static void main(String[] args) {

        var result = 0; // inferred to type int
        var tax_rate = 0.05;    // Line 1 inferred to type double
        var price = 100; // inferred to type int
        var adjusted_tax = price * tax_rate;  // Line 2 inferred to type double

        // compiler error: required 'int' found 'double'
        // when a double is added to an int and the result is a double
        // which does not fit into the result variable which was inferred to be an int.
        // It is equivalent to int a = 10.0; which throws compiler error

//        result = price + adjusted_tax;  // Line 3
        System.out.println("Adjusted price = " + result);
    }
}

