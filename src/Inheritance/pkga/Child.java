package Inheritance.pkga;

import Inheritance.pkgb.Parent;

public class Child extends Parent {
    static String name = "DEF";

    //compiler error: instance method getName() in Inheritance.pkga.Child can't override static method getName()
    //in inheritance.pkgb.Parent
//    public String getName(){
//        return this.name;
//    }
    //compiler error: weaker access privileges
//    private static String getName(){
//        return this.name;
//    }
    // This is valid
//    public static String getName(){
//        return name;
//    }
    //This is also valid
    protected static String getName(){
        return name;
    }

    public static void main(String[] args) {
        System.out.println(new Child().getName());
    }
}
