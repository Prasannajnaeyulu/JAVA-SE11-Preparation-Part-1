package Classes;

public class ForwardReferences {

    static{
        thirdString = "Hello";
    }
    // compiler error: Illegal forward reference secondString not been created fully by this time hence we can't access here..
//    {
//        firstString = " "+secondString;
//    }

    // same as above except accessing secondString via this qualifier but it is valid :) crazy
    // here this.secondString is always 'null' because secondString is a forward reference
    // so initialization will not happen until after line#23 where it is initialized
    {
        firstString = " "+this.secondString;
        System.out.println(this.secondString); // null

    }

    static String thirdString;
    String firstString, secondString="Hi";

    public String toString(){
        return this.firstString+" "+this.secondString+" "+thirdString;
    }

    public static void main(String... args){
        System.out.println(new ForwardReferences()); // null Hi Hello
    }

}
