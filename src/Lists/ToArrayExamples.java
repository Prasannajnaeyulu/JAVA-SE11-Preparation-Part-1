package Lists;

/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 10: Programming Abstractly Through Interfaces
Topic: Declare and Use List and ArrayList instances;
Sub-Topic:  Exploring toArray() method
*/

import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;

public class ToArrayExamples {
    public static void main(String[] args) {

        // testValue will be used to access a single value in returned
        // array
        int testValue = 0;

        // This is a generically typed ArrayList, passing Integer as the
        // parameterized type.
        ArrayList<Integer> intList = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        // This is a raw type ArrayList
        ArrayList rawList = new ArrayList(List.of(1, 2, 3, 4, 5));

        // Set up the parameter we will pass to the toArray() method
        Integer[] aIntArray = new Integer[10];

        System.out.println("---- All tests executed with lists that" +
                " contain: " + rawList + " ----");
        System.out.println("\nScenario 1:  Parameter is reference variable" +
                " for Integer[10], elements all null");
        // Scenario 1: array.length >= list.size();
        //             and array elements initialized to null
        // The method toArray([]<T>) populates the passed array with as
        // many elements as list contains and returns passed array back.
        // No new array is created.
        var bInt = intList.toArray(aIntArray);
        System.out.println("Result type from ArrayList<Integer> " +
                "assigned to var = " +
                bInt.getClass().getTypeName());
        System.out.println("--- Resulting array elements = " +
                Arrays.toString(bInt));

        // No casting required.
        testValue = bInt[0];
        System.out.println("--- No cast required at individual level:" +
                " the first element is " + testValue);

        // Reset the array we use as a parameter between tests, so
        // tests between raw ArrayList and generic ArrayList are same
        aIntArray = new Integer[10];

        // A raw ArrayList will still return array passed, in
        // this case aIntArray reference

        var bRaw = rawList.toArray(aIntArray);
        System.out.println("Result type from ArrayList assigned to var = " +
                bRaw.getClass().getTypeName());
        System.out.println("--- Resulting array elements = " +
                Arrays.toString(bRaw));

        // Casting required.
        testValue = (int) bRaw[0];
        System.out.println("--- Cast required at individual level: the " +
                "first element is " + testValue);

        System.out.println("\nScenario 2:  Parameter is reference variable" +
                " for Integer[10], elements all populated");
        // Scenario 2: array.length > list.size();
        //             and array elements initialized (not null)
        // the method toArray([]<T>) populates passed array with as many
        // elements as list contains, and has one other, maybe unexpected
        // behavioral twist - it sets the element at list.size() to null,
        // leaving all other elements at indices > list.size() as they were.
        aIntArray = new Integer[]{1,2,3,4,5,6,7,8,9,10};
        // here 'intList' is already of type Integer the toArray returns Integer[]
        // the toArray signature would be like this
        // ArrayList public <T>Integer[] toArray(Integer[] a)
        Integer[] cInt = intList.toArray(aIntArray);
        System.out.println("Result type from ArrayList<Integer> " +
                "assigned to Integer[] = " +
                cInt.getClass().getTypeName());
        System.out.println("--- Resulting array elements = " +
                Arrays.toString(cInt));

        // interesting: compiler error: required Integer[] found Object[]
        //Integer[] a = intList.toArray();

        // No casting required.
        testValue = cInt[0];
        System.out.println("--- No cast required at individual level:" +
                " the first element is " + testValue);

        // Reset the array we use as a parameter between tests, so
        // tests between raw ArrayList and generic ArrayList are same
        aIntArray = new Integer[]{1,2,3,4,5,6,7,8,9,10};

        // A raw ArrayList will still return array passed, in
        // this case aIntArray reference, but to assign it to an
        // Integer[] array we must cast.
        // Runtime error: can't cast Object[] to Integer[] because rawList has no type and
        // toArray without any parameter to tell the type always returns Object[] you can't type case
        // Object[] to Integer[]
//        Integer[] a = (Integer[]) rawList.toArray();

        // It is OK here because the type of the parameter we pass in to toArray is Integer so toArray
        // uses Integer type to construct the list and returns the list as Object[]
        // but as the list constructed is all Integers no runtime type casting issues we could see
        // So this code happily sail through
        // interesting: the size of the rawList is '5' but array passed in has size '10' and this aIntArray already
        // filled with some integer elements in this case the toArray copies elements upto List size into aIntArray
        // in the order they appear and it inserts 'null' after and then it will keep rest of the elements as it is
        // this null marks as a boundary to denote up to which index list has copied its elements over to given array
        // So after this call the cRaw contains
        // [1, 2, 3, 4, 5, null, 7, 8, 9, 10]
        // Here 1,2,3,4,5, null updated from list toArray call rest are already existing elements in aIntArray
        Integer[] cRaw = (Integer[]) rawList.toArray(aIntArray);
        System.out.println("Result type from ArrayList assigned to  Integer[] " +
                " required casting = " + cRaw.getClass().getTypeName());
        System.out.println("--- Resulting array elements = " +
                Arrays.toString(cRaw));

        // No Casting required.
        testValue = cRaw[0];
        System.out.println("--- No Cast required at individual level since" +
                " we cast entire array to (Integer[]) : the first element is "
                + testValue);

        System.out.println("\nScenario 3:  No parameter passed");
        // Scenario 3: no parameter
        // the method toArray() populates a newly instantiated Object[]
        // array with the list's elements, which happen to all be Integer.
        // The behavior is the same for both a raw list and generic list
        Object[] dInt = intList.toArray();   // CANNOT cast to (Integer[])
        System.out.println("Result type from ArrayList<Integer> " +
                "assigned to Object[] = " +
                dInt.getClass().getTypeName());
        System.out.println("--- Resulting array elements = " +
                Arrays.toString(dInt));

        // Casting required.
        testValue = (int) dInt[0];
        System.out.println("--- Cast required at individual level:" +
                " the first element is " + testValue);

        Object[] dRaw = intList.toArray();
        System.out.println("Result type from ArrayList " +
                "assigned to Object[] = " +
                dRaw.getClass().getTypeName());
        System.out.println("--- Resulting array elements = " +
                Arrays.toString(dRaw));

        // Casting required.
        testValue = (int) dRaw[0];
        System.out.println("--- Cast required at individual level:" +
                " the first element is " + testValue);
    }

}
