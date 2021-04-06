package Objects;

public class ObjectDeclarationTest {
    public static void main(String... args){
        // compiler error: cannot resolve symbol 'b'
//        Object a=b=new Object();
        // compiler error: cannot resolve symbol 'b'
        // As it evaluates left to right, it can't find variable 'b' in first variable declaration
//        Object a=b, b=new Object();
        //compiler error: can't resolve symbol 's'
        // you can't have two declarations in one statement though the second declared variable type is a child of first type
//        Object a, String s = new String();

        Object a, b = new Object();
        Object a1, b1 = new String();
        Object a2, b3=2, a3=b3;
    }
}
