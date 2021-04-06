package Arrays;

import java.util.Arrays;

public class ArraySearch {
    public static void main(String... args){
        int[] a = {10, 20 , 30, 40};
        int[] b = {40 , 30, 20, 10, -1, 9};

        System.out.println(Arrays.binarySearch(a, 30)); // 2 -> 30 is at index 2 in array 1
        System.out.println(Arrays.binarySearch(b, 9)); // -1 -> though element 9 is in the array it returned -1
                                                            // because As per java spec., for binary search, the array you passed
                                                            // must be in sorted order otherwise it gives unpredictable results

        System.out.println(Arrays.binarySearch(a, 50)); // -1 -> 50 is not there in array a

        String[] str1 = {"ab", "cd", "ef", "gh", "ij"};
        String[] str2 = {"ab", "cd", "ef", "gh"};
        System.out.println(Arrays.mismatch(str1, str2)); // 4 -> index where there is a mismatch

        System.out.println(Arrays.mismatch(str2, str1)); // 4 -> index where there is a mismatch

        System.out.println(Arrays.asList(str1).containsAll(Arrays.asList(str2))); // true

        String[] str3 = {"cd", "ef", "gh", "ab"};
        System.out.println(Arrays.asList(str1).containsAll(Arrays.asList(str3))); // true -> str1 contains all of str2 elements
                                                                                  // in any order

        System.out.println(Arrays.asList(str1).contains(Arrays.asList(str2))); // false -> use contains all to match all
        System.out.println(Arrays.asList(str3).contains("gh")); // true
        System.out.println(Arrays.asList(str3).indexOf("gh")); // 2
        System.out.println(Arrays.asList(str3).lastIndexOf("a")); // -1

        int[] a2 = new int[]{1,2};
        Integer[] a3 = new Integer[]{1,2};
        //compiler error: can't resolve the method mismatch(int[], java.lang.Integer[])
        // static methods inside Arrays like mismatch, equals, compare should have same data types
        // Not even wrappers allowed
//        Arrays.mismatch(a2, a3);
//        Arrays.compare(a2, a3);
//          Arrays.equals(a2, a3);

    }
}
