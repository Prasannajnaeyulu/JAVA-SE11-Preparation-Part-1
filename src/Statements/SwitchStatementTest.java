package Statements;

/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 4: Using Operators and Decision Constructs
Topic: Switch Statements
Sub-Topic: Out of Ordinary
*/

public class SwitchStatementTest {
    public static void main(String[] args) {
        byte[] bytes = {100, 103, 104, 107, 126};
        String caseAssignedValue = "";
//        for (var i : bytes) {  // Using LVTI here
//            switch (i) {  // Use an Expression byte
//                case 127:
//                case 1030: //compiler error: required byte found int value exceeds byte range
//                case 1040: //compiler error: required byte found int value exceeds byte range
//                case 1070: //compiler error: required byte found int value exceeds byte range
//                    caseAssignedValue = "Less than 1100";
//                    break;
//                case 1260: //compiler error: required byte found int value exceeds byte range
//                    caseAssignedValue = "Equal to 1260";
//                    break;
//            }
//            System.out.println("Done processing " + i +
//                    ", caseAssignedValue = " + caseAssignedValue);
//        }

        for (var i : bytes) {  // Using LVTI here
            // switch expression i*10 results in int so case labels with int is OK here
            switch (i * 10) {  // Use an Expression byte multiply by 10 (int) the result of this switch expression is int
                case 1000:
                case 1030:
                case 1040:
                case 1070:
                    caseAssignedValue = "Less than 1100";
                    break;
                case 1260:
                    caseAssignedValue = "Equal to 1260";
                    break;
            }
            System.out.println("Done processing " + i +
                    ", caseAssignedValue = " + caseAssignedValue);
        }

        byte[] bytes1 = {100, 103, 104, 107, 126};
        String caseAssignedValue1 = "";
        for (var i : bytes1) {  // Using LVTI here
            switch (i) {  // Use an Expression
                case 100:
                case 103:
                case 104:
                    continue; // this continue applies to for loop as this switch case is inside a for loop
                case 107:
                    caseAssignedValue1 = "Less than 110";
                    break;
                case 126:
                    caseAssignedValue1 = "Equal to 126";
                    break;
            }
            System.out.println("Done processing " + i +
                    ", caseAssignedValue = " + caseAssignedValue1);
        }

        int a = 10;
        // compiler error: switch not applicable for boolean, double, float, long, Object types (except string, enum and primitive wrapper classes)
        // Incompatible types. Found: 'double', required: 'char, byte, short, int, Character, Byte, Short, Integer, String, or an enum'
//        switch (a*0.0) {  // Use an Expression
//            case 100:;
//            case 103:;
//            case 104:;
//            case 107:;
//                caseAssignedValue1 = "Less than 110";
//                break;
//            case 126:
//                caseAssignedValue1 = "Equal to 126";
//                break;
//        }
        // labels
        String[] args1 = {"12"};
        start_loop:
        for(var str:args1) {
            switch (str) {  // Use an Expression
                case ("1"):
                    System.out.println("1");
                    break;
                case ("1"+"2"):
                    System.out.println("12");
                    break start_loop; // it breaks the for loop outside the switch
                default:
                    System.out.println("Hello I am helpless :(");
                    break;
            }
        }

//        String str2 = "hello";
//        switch (str2 + "") {  // Use an Expression
//            // compiler error: constant expression is required
//            // case expression should be a compiler constant so variables are not allowed in case expressions
//            case (str2+"1"):
//                System.out.println("1");
//                break;
//            case ("1"+"2"):
//                System.out.println("12");
//                break; // it breaks the for loop outside the switch
//            default:
//                System.out.println("Hello I am helpless :(");
//                break;
//        }
        int i = 10;
        for(;;){
            --i;
            if(i<0) break;
            System.out.println("crazy for loop i: "+ i);
            //break;
        }
    }
}
