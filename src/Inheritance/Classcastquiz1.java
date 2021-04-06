package Inheritance;

class SubClass {
    public static String classyName = "abc";
    public static String getClassyName() { return classyName; }
}

public class Classcastquiz1 extends SubClass {
    public static String classyName = "def";
    public static String getClassyName() { return classyName; }

    public static void main(String[] args) {
        Classcastquiz1 tt = new Classcastquiz1();
        Object t = tt;
        Object s = new SubClass();
        int abcCount = 0;
        int defCount = 0;

        int tempcount = ((Classcastquiz1) t).classyName == "abc" ? abcCount++ : defCount++;
        tempcount = ((SubClass) s).classyName == "abc" ? abcCount++ : defCount++;

        tempcount = tt.getClassyName(t) == "abc" ? abcCount++ : defCount++;
        // Runtime error: Exception in thread "main" java.lang.ClassCastException: class Inheritance.SubClass cannot be cast
        // to class Inheritance.Classcastquiz1 (Inheritance.SubClass and Inheritance
        // this matches to a overloaded method getClassyName(Object t)
        // there we are converting Object to ClasscastQuiz1 type but the object we are passing referring to SubClass type
        // hence we get runtime error
        tempcount = tt.getClassyName(s) == "abc" ? abcCount++ : defCount++;

        tempcount = tt.getClassyName((Classcastquiz1) t) == "abc" ? abcCount++ : defCount++;
        tempcount = tt.getClassyName((SubClass) s) == "abc" ? abcCount++ : defCount++;

        System.out.println("abcCount = " + abcCount);
    }

    public String getClassyName(Object t) {
        Classcastquiz1 tt = (Classcastquiz1) t;
        return tt.getClassyName();
    }

    public String getClassyName(SubClass sc) {
        System.out.println("Class Name:" +sc.getClass().getName()); return sc.getClassyName();
    }
}