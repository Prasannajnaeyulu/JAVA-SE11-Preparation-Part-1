package Classes;

public class ClassStaticVariablesAndMethodsQuiz {
    String getMyName() {
        return myName;   // Line 1
    }

    static String myName = "Test";

    public static void main(String[] args) {

        try {
            ClassStaticVariablesAndMethodsQuiz t1 = new ClassStaticVariablesAndMethodsQuiz();
            ClassStaticVariablesAndMethodsQuiz t2 = null;
            System.out.print(ClassStaticVariablesAndMethodsQuiz.myName);
            System.out.print(t1.myName);  // Line 2
            System.out.print(t1.getMyName());

            System.out.print(t2.myName);  // Line 3
            // it throws NullPointerException here which is eventually caught in catch block
            System.out.print(t2.getMyName());    // Line 4
        } catch (Exception e) {
            System.out.println();
        }
    }
}

// It prints TestTestTestTest
