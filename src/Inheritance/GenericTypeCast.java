package Inheritance;


import java.util.ArrayList;
import java.util.List;

class Baseclass {
    public void print(){
        System.out.println("Baseclass");
    }

    public void print(List<Baseclass> lsbaseclass){

    }
}

class Nextclass extends Baseclass {
    public void print(){
        System.out.println("Nextclass");
    }
}
// Note: interesting: generic list casting and generic list function parameters should always have the same type
// even child type list is not allowed
// you can't cast from child to parent or parent to child type lists
public class GenericTypeCast {
    public static void main(String... args){
        float f = (float) 10.0;
        //compiler error: you can't perform division of float with double
        // required float found double
        //Correct Answer: Line 3 fails to compile, because the float cast is applied only to the dividend,
        // and not to the entire expression, so then it results in a double result and cannot be assigned to a float.
        // think of this expression as float f1 = (float)f/2.0;
        // it converts f to float and then it divides this with double then the result will be double
        // assigning double to float is an error
//        float f1 = (float) f/2.0;
        List lsraw = new ArrayList();
        lsraw.add(new Nextclass());
        lsraw.add(new Nextclass());

        List<Nextclass> lsNextclass = new ArrayList<>();
        lsNextclass.add(new Nextclass());
        lsNextclass.add(new Nextclass());

        List<Baseclass> lsbaseclass = new ArrayList<>();
        lsbaseclass.add(new Nextclass());
        lsbaseclass.add(new Nextclass());
        //compiler error: can't cast java.util.List<Baseclass> to java.util.List<Nextclass>
//        (List<Nextclass>)lsbaseclass;
        //compiler error: can't cast java.util.List<Nextclass> to java.util.List<Baseclass>
//        (List<Baseclass>)lsNextclass;
        Baseclass b = new Nextclass();
        // compiler error: java.util.List<Baseclass> can't be applied to java.util.List<Nextclass>
//        b.print(lsNextclass);

    }
}
