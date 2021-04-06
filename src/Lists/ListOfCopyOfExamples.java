package Lists;

import java.util.ArrayList;
import java.util.List;

public class ListOfCopyOfExamples {
    public static void main(String... args){
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<5;i++)
            li.add(i+1);
        li.add(null);

        // Runtime error: NullPointerException list li contains null element
//        List<Integer> li1 = List.copyOf(li);

        // Runtime error: NullPointerException the array or the parameters supplied as array elements to 'of' method
        // shouldn't contain null; Indeed the point here is the elements of a list created by this call shouldn't contain nulls
//        List.of(1,2,4,5,null);

        // It is OK. here li contains null but the list created by this call contains 'li' as an element
        // So it don't care what elements are inside 'li' as long as 'li' is not null it is OK. No runtime exception here
        List l2 = List.of(li); // [[1, 2, 3, 4, 5, null]]

        System.out.println(li); // [1, 2, 3, 4, 5, null]
        System.out.println(l2); // [[1, 2, 3, 4, 5, null]]
    }
}
