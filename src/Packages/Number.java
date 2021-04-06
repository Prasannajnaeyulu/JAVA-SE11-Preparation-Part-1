package Packages;

import Packages.Package;

import java.lang.*;

// It is OK to create a class same as java default classes
public class Number {
    java.lang.Number n;
    Number(java.lang.Number n1){
        this.n = n1;
        System.out.println("Inside Java.lang.Number Constructor, value: "+ n1);
    }

    Number(Number n2){
        System.out.println("Inside Number Constructor, value: "+n2);
    }

    public String toString(){
        return String.valueOf(this.n);
    }

    public static void main(String... args){
        Number n1 = new Number(10);
        Number n2 = new Number(n1);
        java.lang.Number n3 = 20;
        System.out.println(n3);
    }

}
