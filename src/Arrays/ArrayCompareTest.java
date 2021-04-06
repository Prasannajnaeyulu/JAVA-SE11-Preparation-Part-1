package Arrays;

import java.util.Arrays;

public class ArrayCompareTest {
    public static void main(String[] args) {
        int[] a = {10,20,30,40};
        int[] b = {20, 10, 30, 40};

//        Arrays.equals(a,b); //false - though both arrays content is equal, order of elements is different arrays equals
//                            // checks the order also
//        Arrays.sort(b);
//        // Now it is ok as we sort the array b and array a is already in sorted order so order is now alright
//        System.out.println(Arrays.equals(a, b));
//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(b));

        System.out.println(Arrays.compare(a,b)); //-1 -> as there is no prefix match in neither arrays it returns the
                                                // first unmatched element.compareTo(second array unmatched element)
                                                // 10.compareTo(20) = -1
        String[] str1 = new String[]{"a", "b", "c"};
        String[] str2 = {"a", "b", "c"};
        System.out.println(str1.equals(str2)); //false -> it calls Object class equals method
        System.out.println(Arrays.equals(str1, str2)); //true -> it checks the contents

        String[][] a1 = new String[][]{{"hello", "hi"}, {"welcome", "johns"}};
        System.out.println(Arrays.deepToString(a1)); //[[hello, hi], [welcome, johns]]

        String[][] a2 = new String[0][0];
        // Runtime error: Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
        // Index 0 out of bounds for length 0
//        a2[0] = new String[]{"a", "b"};
//        a2[1] = new String[]{"c", "d"};
        System.out.println(Arrays.deepToString(a2)); // []

        a2 = new String[][]{{"a", "b"}, {"c", "d"}};
        System.out.println(Arrays.deepToString(a2)); //[[a, b], [c, d]]

        String[] str3 = new String[]{"hi", "hello"};
        String[] str4 = new String[]{"hello", "hai"};
        System.out.println(Arrays.compare(str3, str4));// "hi".compareTo("hello");

        // compiler error: Ambiguous method call matches compare(boolean[], boolean[]) and compare(byte[], byte[])
//        System.out.println(Arrays.compare(null, null));
        System.out.println(Arrays.compare(a, null)); // 1 -> if second argument is null it returns 1
        System.out.println(Arrays.compare(null, a)); // -1 -> if first argument is null it returns -1

        String[] str5 = new String[]{"ab", "cd", "ef", "gh"};
        String[] str6 = new String[]{"ab", "cd", "ef"};
        System.out.println(Arrays.compare(str5, str6)); // 1 -> str5.length - str6.length

        System.out.println(Arrays.compare(str5, 0, 2, str6, 0, 2)); // 0
        System.out.println(Arrays.compare(str5, 0, 1, str6, 0, 3)); // -2
    }
}
