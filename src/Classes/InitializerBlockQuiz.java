package Classes;

class test {

    public int test;  // Line 1
    {
        test = 1;
    }

    // it is perfectly valid it won't be treated as constructor
    public int test() { return test;   }  // Line 2

    // it is treated as a constructor
    // All instance initialization blocks will complete first constructor is last
    // So final value of test becomes '2'
    public test() {  test = 2;   }
    {   test = 3;   }  // Line 3

    // compiler error: non-static field test can't be referenced from a static context
//    static { test = 4; }   // Line 4

    public String toString() {  return ""+test();   }
}

public class InitializerBlockQuiz {
    public static void main(String[] args) {
        test test = new test();   // Line 5
        System.out.println(test); // 2
    }

}
