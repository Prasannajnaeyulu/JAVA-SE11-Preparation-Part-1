package Statements;

public class IfElseTest {
    public static void main(String... args){
        boolean flag = false;
        boolean subflag = false;
        if(flag); // empty statements for if is valid just terminate with semicolon ';'
        else System.out.println("1. flag is false");

        if(flag)
            if(subflag)
                System.out.println("2. subflag is true");
        // it is valid if two else statement first one map to inner if statement and later on to outer if statement
        else System.out.println("3. subflag is false");
        else System.out.println("4. flag is false");
    }
}
