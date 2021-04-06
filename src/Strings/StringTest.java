package Strings;

import Scopes.Person;

import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringTest {
    public static void main(String...  args){
        String s1 = "hello"; // It creates entry in string constant pool
        String s2 = "hello"; // it uses the same entry created above in String constant pool
        System.out.println(s1==s2); //true
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.equalsIgnoreCase(s2)); //true
        System.out.println(s1.compareTo(s2)); //0
        System.out.println(s1.compareToIgnoreCase(s2)); // 0
        System.out.println(s1.contentEquals(s2)); //true
        String s3 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        System.out.println(s1.equals(s3)); //true
        System.out.println(s1==s3); //false
        System.out.println(s1.compareTo(s3)); //0
        System.out.println(s1.compareToIgnoreCase(s3)); // 0
        System.out.println(s1.contentEquals(s3)); //true

        String s4 = "Hello mississipi";
        Pattern p = Pattern.compile("(.*)mississipi");
        Matcher m = p.matcher(s4);
        System.out.println(m.matches());
        System.out.println(m.group(0)); // group0 holds whole string - 'Hello mississipi'
        System.out.println(m.group(1)); // group1 - holds first matched group - 'Hello'

        // tooffset -> starting offset of first string 's4'
        // other -> second string
        // ooffset -> starting offset of second string
        // len -> number of characters from starting offset to compare
        // It returns false if the length is beyond first or second string max.
        boolean isMissiFound1 = s4.regionMatches(6, "missi", 0, 20); //false

        boolean isMissiFound = s4.regionMatches(6, "missi", 0, 5); //true
        boolean isMissiIgnoreCaseFound = s4.regionMatches(true,6, "Missi", 0, 5); //true
        System.out.println(isMissiFound);
        System.out.println(isMissiIgnoreCaseFound);

        String s = "    ";
        // code points returns char utf code values
        // say ' ' character 32 'A' -> 65 etc...
        for(int i: s.codePoints().toArray())
            System.out.print(i);
        // s.isEmpty() returns false to cover this in java11 we've isBlank method
        System.out.println(s.isEmpty()); //false
        StringBuilder sb = new StringBuilder();
        sb.append((Object)"Hello");
        // It inserts given string at index 3 index starts from 0
        //sb.insert(3, "hi");
        System.out.println(sb.lastIndexOf("l", 2));

        // you can add object to string which calls its toString() method and append to string to its left
        // toString() on custom object here returns hashcode of an object
        String s7 = sb.toString()+new Packages.garden.vegetables.Vegetable(); //HelloPackages.garden.vegetables.Vegetable@12dfr4
        System.out.println(s7);
        System.out.println(s7.startsWith("ll", 2)); //true - whether the substring starts at index2 is "ll"

        // Somehow my Java 11 is not recognized this isBlank method
//        System.out.println(s.isBlank()); // true

    }
}
