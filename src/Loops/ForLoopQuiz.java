package Loops;

public class ForLoopQuiz {
        static int testVariable;

        public static void main(String[] args) {
            byte i, j;

            //Infinite loop
            // Because 'i' is a variable of type byte, when the value exceeds 127, i overflows and becomes a negative number,
            // and when i reaches -128, i overflows again and becomes 127. So The value of 'i' is always be between -128 to 127
            // which is always <=300, so the loop goes on infinitely.
            for (i = 100, j = 0; i <= 300; i += 90, j++) { // Line 1
                testVariable = i % 50;   //  Line 2
                System.out.print(testVariable + " "); // Line 3
            }
            System.out.println(j);
        }
}
