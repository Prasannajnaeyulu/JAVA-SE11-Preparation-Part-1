package Inheritance;

import java.util.Arrays;

class Animal{
    public void printProps(int... a){
        System.out.println("Parent class print method "+ Arrays.toString(a));
    };
    public void printAnimal(Animal a){
        a.printAnimal(a);
        //System.out.println("I am an Animal of Animal Type");
    }
}

class Dog extends Animal{
     public void printAnimal(Animal d){
            System.out.println("I am an Animal of Dog Type");
     }
}

class Cat extends Animal{
    public void printProps(int[] a){
        System.out.println("Subclass print method: "+Arrays.toString(a));
    }
    public void printAnimal(Animal c){
        System.out.println("I am an Animal of Cat Type");
    }
}

public class ClassCast{
    public static void main(String[] args){
        Animal a = new Dog();
        Animal b = new Cat();
        Animal a1 = new Animal();
        // Runtime error: Exception in thread "main" java.lang.ClassCastException: class Inheritance.Dog cannot be cast to
        // class Inheritance.Cat (Inheritance.Dog and Inheritance.Cat are in unnamed module of loader 'app')
//        a.printAnimal((Cat)a);
        a1.printAnimal(a);
        // Runtime error: Exception in thread "main" java.lang.ClassCastException: class Inheritance.Cat cannot be cast to
        // class Inheritance.Dog (Inheritance.Dog and Inheritance.Cat are in unnamed module of loader 'app')
//        b.printAnimal((Dog)b);
        Animal a2[] = new Dog[10];
        Arrays.fill(a2, new Dog());

        //Runtime error: Exception in thread "main" java.lang.ClassCastException: class [LInheritance.Animal; cannot be cast to
        // class [LInheritance.Dog; ([LInheritance.Animal; and [LInheritance.Dog; are in unnamed module of loader 'app')
        // The obvious reason could be Animal[] can hold any subtype Objects not just Dog. Hence this type of typecasting is not allowed
        // It is OK if Animal[] is assigned to an Array of Dog. As Animal[] a2 = new Dog[10];
//        Dog[] d = (Dog[])a2;


        b.printProps(1,2,3,4);
    }
}
