package Packages;
import Packages.garden.vegetables.*; // this takes precedence
import Packages.nursery.vegetables.*;
// compiler error: syntax of static import is wrong it should be import static
// static import java.lang.Math.*;
import static java.lang.Math.*;
import static Packages.nursery.vegetables.Vegetable.PI; // this takes precedence

public class PackageMain{
	public static void main(String... args){
		Vegetable.main();
		//if two classes with same name use FQCN (Fully qualified class Name)
		Packages.garden.vegetables.Vegetable.main();
	}
}

class Vegetable{
	// this takes precedence
	static String sqrt(int a){
		return "No";
	}
	public static void main(String... args){
		System.out.println("I am local vegetable");
		System.out.println(PI);
		System.out.println(sqrt(2));
	}
}