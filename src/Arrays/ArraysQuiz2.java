package Arrays;

import java.util.Arrays;

public class ArraysQuiz2 {
    public static void main(String[] args) {

        int[][] spreadsheet = new int[3][];
        spreadsheet[0] = new int[3];
        spreadsheet[1] = new int[]{1, 2, 3}; // Line 1
        // interesting it prints [[0, 0, 0], [1, 2, 3], null]
        // uninitialized array gets null; here for last row of the array
        // i.e., spreadsheet[2] as it is not initialized it gets null hence the output
        // it prints [[0, 0, 0], [1, 2, 3], null]
        System.out.println(Arrays.deepToString(spreadsheet)); // Line 2

    }
}
