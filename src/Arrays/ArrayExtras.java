package Arrays;

/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 5: Working with Java arrays
Topic: Arrays
Sub-Topic: Out of Ordinary
*/

import java.util.Arrays;

public class ArrayExtras {
    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        // You can assign an int variable to a long
        long myLong = a;
        System.out.println("myLong = " + myLong);

        // And you can do this:
        long[] longArray = {0, 1, 2, 3, 4};
        System.out.println("longArray = " +
                Arrays.toString(longArray));

        // And this:
        long[] myLongArray = new long[2];
        myLongArray[0] = a;
        myLongArray[1] = b;
        System.out.println("myLongArray = " +
                Arrays.toString(myLongArray));

        // And you know you can do this.  Java autoboxes
        Integer aInteger = a;
        Integer bInteger = b;
        System.out.println("aInteger = " + aInteger);

        Integer[] integerArray = {0, 1, 2, 3, 4};
        System.out.println("integerArray = " +
                Arrays.toString(integerArray));

        Integer[] myIntegerArray = new Integer[2];
        // You can mix and match Integer, int here
        myIntegerArray[0] = aInteger;
        myIntegerArray[1] = b;
        System.out.println("myIntegerArray = " +
                Arrays.toString(myIntegerArray));

//        // compiler error: required Long[] found int[]
//        Long[] newLongArray = new int[2];
//        // required Integer[] found int[]
//        Integer[] newIntegerArray = new int[2];

//        int[] intArray = {0, 1, 2, 3, 4};
        // compiler error: mismatch, equals, compare in Arrays should have equal primitive types;
        // if one of the parameter is primitive type then second one should also be primitive type
        // No overloaded method exist in Arrays class like this 'mismatch(int[] a, T[] b)', 'equals(int[] a, T[] b)' or
        // 'compare(int[] a, T[] b)' so it is compiler error.
//        int misMatchedIndex = Arrays.mismatch(intArray, integerArray);
//        boolean theSame = Arrays.equals(intArray, integerArray);
//        int compared = Arrays.compare(intArray, integerArray);


        System.out.println("\n---- Test methods with common super class");
        Number[] myNumberArray = {0, 1, 2, 4, 5};
        // it matches mismatch(Object[], Object[])
        System.out.println("Arrays.mismatch(myNumberArray, integerArray) = "
                + Arrays.mismatch(myNumberArray, integerArray)); // 3 index at which both arrays differs
        // it matches equals(Object[], Object[])
        System.out.println("Arrays.equals(myNumberArray, integerArray) = "
                + Arrays.equals(myNumberArray, integerArray));

        //compiler error: Cannot resolve method 'compare(java.lang.Number[], java.lang.Integer[])'
        // this is because compare should need classes implements comparable interface
        // Number class didn't implement comparable interface hence this is not allowed
//        int compare = Arrays.compare(myNumberArray, integerArray);
    }
}

