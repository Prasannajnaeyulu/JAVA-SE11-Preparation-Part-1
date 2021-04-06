package Classes;

class AppTest {
    // static initializations and static blocks executes in the same order they are in
    static String AppName = "Great";
    final static String goodName = "Good";
    // by this time AppName="Great"
    final static String greatName = AppName;  // Line 1

    static {
        AppName += " Name";   // Line 2
    }
    // by the time in intializes the AppName gets modified to AppName+=" Name" by the above static initialization block
    // so badName here assigns to "Great Name"
    final static String badName = AppName;   // Line 3
}

public class ClassStaticMembersAccessQuiz2 {
    public static void main(String[] args) {

        AppTest t = null;
        System.out.println(t.goodName); // Good
        System.out.println(t.greatName); // Great
        System.out.println(t.badName); // Great Name
    }
}
