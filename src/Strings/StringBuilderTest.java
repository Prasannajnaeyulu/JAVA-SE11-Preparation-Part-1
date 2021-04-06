package Strings;
import java.lang.StringBuilder;

public class StringBuilderTest {
    public static void main(String... args){
        StringBuilder sb = new StringBuilder(0); // it has capacity '0' but grows dynamically as we append text
        System.out.println(sb.capacity());
        sb.append("Hello").append("World");
        System.out.println(sb); // it calls toString() method of StringBuilder and prints HelloWorld
        System.out.println(sb.capacity());

        StringBuilder sb1 = new StringBuilder("HelloWorld"); // default capacity of Stringbuilder is '16'
        System.out.println(sb1.capacity()); // 26 => (default capacity 16 + HelloWorld size which is 10)
        System.out.println(sb == sb1); // false because it compares reference addresses than content
        System.out.println(sb.equals(sb1)); // false - this is Object class equals method which compares reference addresses just like == above
        // JAVA 11 in my system somehow not recognized compareTo method but it is there in StringBuilder
        //System.out.println(sb.compareTo(sb1)); // 0 - StringBuilder implements comparator so it is valid if two string builder content is same it return 0
        System.out.println(sb.toString() == sb1.toString()); // false - both represents two Different String Objects though the content is same

    }
}
