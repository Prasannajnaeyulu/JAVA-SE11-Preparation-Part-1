package Arrays;

/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 5: Working with Java arrays
Topic: Arrays
Sub-Topic: Out of the Ordinary
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysAndLists {
    public static void main(String[] args) {

        String[] firstString = {
                "abc", "def", "ghi", "jkl", "mno",
                "pqr", "stu", "vwx", "yz"
        };
        // these two methods returns an Immutable list objects
        List firstList = List.copyOf(Arrays.asList(firstString));
        // As it is a List.of over another list object,  the secondList will become list of list
        // [[ "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vwx", "yz"]]
        List secondList = List.of(firstList);

        // Runtime error: Exception in thread "main" java.lang.UnsupportedOperationException
        //	at java.base/java.util.ImmutableCollections.uoe(ImmutableCollections.java:71)
        //	at java.base/java.util.ImmutableCollections$AbstractImmutableList.set(ImmutableCollections.java:109)
        //	at Arrays.ArraysAndLists.main(ArraysAndLists.java:25)
//        firstList.set(0, "hello");
//        secondList.set(0, "hi");

        System.out.println("firstList = " + firstList.toString());
        System.out.println("secondList = " + secondList.toString());

        Object o = firstList.get(0);
        System.out.println(o.getClass().getName());

        o = secondList.get(0);
        System.out.println(o.getClass().getName());

        System.out.println("\n--------  subList example ---------");
        List subList = Arrays.asList(firstString).subList(0, 5);
        System.out.println("subList = " + subList.toString());

        // Sort the sublist
        subList.sort(Collections.reverseOrder());
        System.out.println("subList after reverse = "
                + subList.toString());

        System.out.println("firstString array  = "
                + Arrays.toString(firstString));
        System.out.println("firstList = " + firstList.toString());

        // Now let's look at toArray
        System.out.println("\n--------  toArray examples ---------");
        int arrayLength = firstList.size(); // arrayLength changes results

        // Set up a new array which we will pass to toArray
        String[] aArray = new String[2]; //default values of String type array are 'null'

        // Calling toArray without assigning returned array to a variable;
        // here as the length of aArray is less than firstList size, nothing gets copied to aArray
        // but toArray() function uses the dataType of aArray to create a new array with the size of firstList
        firstList.toArray(aArray);
        System.out.println("aArray array  = " + Arrays.toString(aArray)); // [null, null]

        List<Integer> lsint = new ArrayList<>();
        lsint.add(1);
        lsint.add(2);
        lsint.add(3);
        lsint.add(4);
        String[] str = new String[4];
        Integer[] intArray = new Integer[4];
        //Runtime Error:
        // Exception in thread "main" java.lang.ArrayStoreException: arraycopy: element type mismatch: can not cast one
        // of the elements of java.lang.Object[] to the type of the destination array, java.lang.String
        //lsint.toArray(str);
        // as per toArray syntax, if the length of destination array passed as argument is less than the list size
        // then it will create a new array with the specified destination array dataType (here in our case Integer and copies)
        // with size as size of the list but not with the size of destination array
        //  So it eventually equals to lsint.toArray();
        intArray = lsint.toArray(new Integer[0]); // it eventually equals lsint.toArray();
        System.out.println("int array  = "
                + Arrays.toString(intArray));
        // Set up another new array which we will pass to toArray
        String[] bArray = new String[arrayLength];

        // compiler error: Required String[] found Object[]
        // because firstList is a raw type so calling toArray returns raw array 'Object[]' though the type
        // it inferred from the bArray parameter is a string. Hence we've to cast explicitly otherwise compiler throws the error
//        String[] nextArray = firstList.toArray(bArray);

        // Calling toArray assigning returned array to a variable;
        String[] nextArray = (String[]) firstList.toArray(bArray); // here nextArray and bArray reference the same array
        System.out.println("bArray array  = "
                + Arrays.toString(bArray));

        System.out.println("nextArray array  = "
                + Arrays.toString(nextArray));

        // interesting. this equals returns true because bArray is a reference that 'firstList.toArray' call above is used
        // to copy the list elements to an array. And 'nextArray' is a returned array pointer.
        // So both nextArray and bArray reference the same hence memory addresses are equal so this equals returns true
        // Note: arrays by default are supertypes of Object class so equals here is basically Object class equals which compares
        // reference addresses not the content here in this example both references pointing to same address
        System.out.println("nextArray.equals(bArray) = "
                + nextArray.equals(bArray));

        System.out.println("\n------- Final toArray examples --------");
        // If you always want an array that represents the elements
        // exactly in the list, you can pass a 0 length array
        String[] arrayRepresentation =
                (String[]) firstList.toArray(new String[0]);

        System.out.println("arrayRepresentation array  = " +
                Arrays.toString(arrayRepresentation));

        // You can call toArray with no parameter, it returns an array of Object
        Object[] objectArray = firstList.toArray();
        System.out.println("objectArray array  = " +
                Arrays.toString(objectArray));

        //Runtime exception: Object[] can't be cast to String[]; Because the Object[] is built from the toArray call over
        // raw list, the default toArray() call of list returns Object[]. So you can't typecast to String[] even though list is of type String :)
//        String[] newRepresentation = (String[]) objectArray;
//        System.out.println("newRepresentation array  = " +
//                Arrays.toString(newRepresentation));


        // If you specify the type of array to covert this list as a first argument as follows, then you can type cast
        // Object[] to String[]
        Object[] objectArray1 = firstList.toArray(new String[0]);

        String[] newRepresentation1 = (String[]) objectArray1;
        System.out.println("newRepresentation array1  = " +
                Arrays.toString(newRepresentation1));

        String[] array2 = new String[firstList.size()+3];
        // objectArray2 refers to same memory address as array2 as toArray uses array2 to copy the elements instead of
        // creating a new array because array2 is size is >= firstList size.
        // Other point to note is if size of array2 is large, then toArray copies all elements up to list size and
        // null to rest of the elements
        // hence the output is [abc, def, ghi, jkl, mno, pqr, stu, vwx, yz, null, null, null]
        Object[] objectArray2 = firstList.toArray(array2);

        // both prints [abc, def, ghi, jkl, mno, pqr, stu, vwx, yz, null, null, null]
        System.out.println("array2  = " +
                Arrays.toString(array2));
        System.out.println("objectarray2  = " +
                Arrays.toString(objectArray2));

        System.out.println("ObjectArray equals array2? "+ objectArray2.equals(array2)); // true
    }
}
