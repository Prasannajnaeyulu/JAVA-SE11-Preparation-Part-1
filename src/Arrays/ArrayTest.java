package Arrays;

import java.util.Arrays;
import java.util.List;

public class ArrayTest {
    public static void main(String... args){
        int[] a = new int[2];

        // compiler error: required Integer[] found int[] autoboxing won't work with array creation
//        Integer[] a1 = new int[2];

        // compiler error: required long[] found int[] widening won't work with array creation
//        long[] lng = new int[2];

        //compiler error: expression is expected we need new operator
//        int[] b = int[3];

        //compiler error: we should never specify size on the left hand size of the array declaration
//        int[2] c;

        //compiler error: we should never specify size when array initialization is used
//        int[] c = new int[2]{10,20};

        int[] d = new int[]{1,2,3,4,5};
        int[] e = {1,2,3,4,5};
        int[] f ;
        // compiler error: array initializer is not allowed here. Initialization should always be done in the declaration
        // statement itself. We shouldn't do after
//        f = {1,2,3,4,5};

        int[] s[]; // it creates a two dimensional array
        String[] str = {"a", "b", null, "c"};
        // default values for primitive int are '0'
        int[] s2 = new int[3];
        //default values for Integer wrapper types is 'null'
        Integer[] s3 = new Integer[3];
        for(int i=0;i<s2.length;i++)
            System.out.println(s2[i]); // it prints 0
        for(int i=0;i<s3.length;i++)
            System.out.println(s3[i]);// it prints null

        //short form for the above for loops is
        System.out.println(Arrays.toString(s2)); // it prints [0, 0, 0]
        System.out.println(Arrays.toString(s3)); // it prints [null, null, null]
        System.out.println(Arrays.toString(str)); // it prints [a, b, null, c]

        // Runtime error: java.lang.NullPointerException array passed to List.of method shouldn't contain null elements
        System.out.println(List.of(str));
    }
}
