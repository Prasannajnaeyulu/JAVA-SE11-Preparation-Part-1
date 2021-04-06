package Arrays;

import java.util.Collections;
import java.util.List;

public class ListSubList {
    public static void main(String... args){
        String[] str = new String[]{"ab", "cd", "ef", "gh", "ij" };
        List<String> lsStrings = List.of(str);
        // Runtime error: Exception in thread "main" java.lang.UnsupportedOperationException
        // because the list returned by List.of is immutable; So no changes are permitted
//        lsStrings.add(0, "dd");

        //This is very Interesting
        // The javadoc of subList is as follows....
        // subList method Returns a view of the portion of this list between the specified
        //     * {@code fromIndex}, inclusive, and {@code toIndex}, exclusive.  (If
        //     * {@code fromIndex} and {@code toIndex} are equal, the returned list is
        //     * empty.)  The returned list is backed by this list, so non-structural
        //     * changes in the returned list are reflected in this list, and vice-versa.
        //     * The returned list supports all of the optional list operations supported
        //     * by this list.<p>
//        List sublist = lsStrings.subList(0, 3);
        //Runtime Error: Exception in thread "main" java.lang.UnsupportedOperationException
        // any non-structural changes to subList reflects in the Original List from which this sublist is created
        // So this sort actually sorts the elements in the original list 'lsStrings'
        // But lsStrings is immutable as it is created from List.of method hence we get runtime error here
        // very tricky :)
//        sublist.sort(Collections.reverseOrder());

        // sublist with same from and to index returns empty list
        List sublist1 = lsStrings.subList(2, 2);
        System.out.println(sublist1); // []

//        List sublist2 = lsStrings.subList(0, 3);
        // Runtime Error: editSubList method is changing this subList2 hence we get runtime error as sublist2 is
        // referring immutable collection
//        List sublist3 = editSubList(sublist2);
//        System.out.println("------------------------------");
//        System.out.println("sublist2:  "+sublist2);
//        System.out.println("sublist3:  "+sublist3);
    }

    // Runtime Error: Exception in thread "main" java.lang.UnsupportedOperationException
    // In Java Objects passed by reference where as primitives passed by value.
    // So any changes to 'lssubList' make the changes to 'sublist2' in the main method above
    // So as sublist2 is an immutable collection we are not supposed to change by sort
    static List editSubList(List lssubList){
        lssubList.sort(Collections.reverseOrder());
        System.out.println("lssublist: "+ lssubList);
        return lssubList;
    }
}
