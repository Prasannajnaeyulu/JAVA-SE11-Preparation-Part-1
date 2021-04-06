package PrimitiveDataTypes;

public class TruncateNumber {
    public static void main(String[] args) {

        float myFloat = 123.456f;
        Float myFloatWrapper = new Float(myFloat);
        int myNumber = (int) myFloat;
        double d = 20.0;
        int a = (int)d;

        Double d1 = 20.0;
        // compiler error: can't cast java.lang.Double to java.lang.Integer
//        Integer a = (Integer)d1;

        // Casting with loss of precision..
        System.out.println("myNumber = " + myNumber);

        // We can get the same result using Float.intValue();
        System.out.println("Float.intValue() = " + myFloatWrapper.intValue());

    }

}
