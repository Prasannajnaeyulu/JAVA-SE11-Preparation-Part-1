package Arrays;

public class ArraysQuiz {
    public static void main(String[] args) {

        int[] aArray = new int[3];
        Integer[] bArray = new Integer[3];
        aArray[2] = 1;
        bArray[0] = 1;  // Line 1

        for (int a : aArray) {
            System.out.print(a + " ");
        }
        System.out.println("");
        // Compiler is fine as auto unboxing works here
        // But we get a Runtime error: bArray returns null for index 1 and index 2
        // Integer array default values are null in the code above we are filling only first index leaving
        // other indexes to null
        for (int b : bArray) {  // Line 2
            System.out.print(b + " ");  // Line 3
        }
    }
}

