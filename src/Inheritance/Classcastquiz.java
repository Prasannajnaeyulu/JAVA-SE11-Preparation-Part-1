package Inheritance;


class Plant {}
class Flower extends Plant {}
public class Classcastquiz {

    public static void main(String[] args ) {

        // Primitive Casting
        float f1 = (float) 10.0;  // Line 1
        float f2 = (float) 10.0f;  // Line 2
        //compiler error: can't assign double to float f3
        // because this expression converts f1 to float and divides it with double so the result is a double
//        float f3 = (float) f1/2.0;  // Line 3
        float f4 = (float) f1/2.0f;  // Line 4

        // Object Casting
        Object o = new Plant();
        Plant plantA = new Flower();
        Plant plantB = (Plant) o;  // Line 5
        Plant plantC = (Flower) o;  // Line 6 // as 'o' is Plant type object you get class cast exception during runtime
        Flower flower = (Flower) o;  // Line 7 // as 'o' is Plant type object you get class cast exception during runtime
    }
}
