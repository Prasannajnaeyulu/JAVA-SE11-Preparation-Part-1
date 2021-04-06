package Strings;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringConcatenation {
    public static void main(String... args){
        String s1 = "hello";
        s1+= 5+7; // hello12 - '+' operator has more precedence than '+=' hence addition will be performed first

        s1=" "+5+7; // hello 57 - It first concatenate " " with 5 which becomes string so it concatenate string to 7 lastly
        // compiler error: can't resolve symbol 'j'
//        int i=j=10;

        int i=10, j=10;
        s1 = i + j +"hello"+ i + j; // 20hello 1010
        System.out.println(s1);
        String s = "Hello welcome to \n Java World of Programming \n Hope you enjoy it";
        // split by space delimiter but limit the split to 2 only
        String[] splitWords = s.split(" ", 2);
        // output: //[Hello, welcome to Java World of Programming Hope you enjoy it]
        System.out.println(Arrays.toString(splitWords));

        String s4 = new String("hello");
        String s2 = "hello";
        String s3 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        s4 = s4.join(" ", s1, s2, s3);
        System.out.println(s4); //hell hello hello
        String s5 = s4.join(" ");
        System.out.println(s5);
        // compiler error: delimiter, prefix or suffix shouldn't be char it must be a string so enclose in double quotes
        // here we used char literal ',' hence the error
//        StringJoiner sj = new StringJoiner(',', "[", "]");
        // It is OK now
        StringJoiner sj = new StringJoiner(",", "[", "]");
        sj.add("Hello").add("World");
        System.out.println(sj); // [Hello,World]
        System.out.println(sj.toString()); //[Hello,World]

        StringJoiner sj1 = new StringJoiner(",", "(", ")");
        sj1.add("Crazy").add("Joining");
        System.out.println(sj1); //(Crazy,Joining)
        // it merges sj1 into sj but omits prefix and suffix of sj1
        sj = sj.merge(sj1);
        System.out.println(sj); // [Hello,World,Crazy,Joining]
        // Some how my java 11 not recognizing lines and strip methods in String class :(
//        s4 = s4.lines().collect(Collectors.joining(","));
//        System.out.println(s4);
//        s1 = new String("hello").strip();
//        System.out.println(s1);
    }
}
