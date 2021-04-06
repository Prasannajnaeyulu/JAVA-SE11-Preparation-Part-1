package Lists;

import java.util.ArrayList;
        import java.util.List;





/*
Which statement is not true about the copyOf method on java.util.List.

A. The list it returns is immutable

B. The list which is being copied must not contain nulls

C. The method is overloaded to support variable arguments

D. The method is static

E. The list being copied will have its elements copied in the same order of the list

F. All are true

G. None are true

Answer: C is not true 'List.copyOf' method only accepts Collection interface types as parameter
 */
public class ListQuiz {
    public static void main(String[] args) {

        ArrayList<String> blist = new ArrayList<>(List.of("A", "B", "C", "D"));  // Line 1
        String[] bArray = blist.toArray(new String[5]);   // Line 2
        // Runtime error: NullPointerException List.of throws null pointer exception if any of the array elements
        // it is converting to a list has null values. Here in the above line blist.toArray inserts null at the fourth index
        // so converting bArray using List.of(bArray) throws NullPointerException
        //Exception in thread "main" java.lang.NullPointerException
        //Code compiles but you cannot use List.of method with a List that contains nulls, which the array we pass to the method does.
        // When you pass an array to the toArray() method with a size greater than the number of elements in the List, the result is
        // an array, filled with nulls past the list size.
//        List<String> immutableList = List.of(bArray);

        //compiler error: even blist is of type String the toArray method return raw Object[] which you can't
        // convert to String[]
//        bArray = (String[])blist.toArray();

        bArray = (String[])blist.toArray(new String[0]);
        List<String> immutableList = List.of(bArray);
        // Note: ArrayList creates a new collection from immutableList passed as parameter it copies
        // the elements in the order they appear in the immutableList
        // So immutableList and clist are two different addresses though the content is same
        ArrayList<String> clist = new ArrayList<>(immutableList);   // Line 3

        System.out.println(immutableList == clist); //false
        clist.add("E");
        System.out.println(immutableList); // [A, B, C, D]
        System.out.println(clist); // [A, B, C, D, E]
    }
}