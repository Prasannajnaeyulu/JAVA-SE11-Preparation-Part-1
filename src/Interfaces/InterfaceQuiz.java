package Interfaces;

public interface InterfaceQuiz {
    // compiler error: it is public static final by default so final variable should be initialized with some value
    //public static int counter;

    private void doItPrivately() {
        System.out.println("A private method");
    }

    void doThat();

    default String doThat(String s) {
        return s;
    }
}
