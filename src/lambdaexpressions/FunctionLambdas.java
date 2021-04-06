package lambdaexpressions;

import java.math.BigInteger;
import java.util.function.Function;

class Person{
    String name, email, address;
    BigInteger phoneNumber;

    // this function takes person object as parameter and returns String
    public String printCustom(Function<Person, String> p){
        return p.apply(this);
    }

    public String printEastern(){
        return this.name + " "+ this.email + " "+this.phoneNumber;
    }
}
public class FunctionLambdas {
    public static void main(String... args){
        Person p = new Person();
        p.name="Anji";
        p.email="test@test.com";
        p.phoneNumber = new BigInteger("7704123456");
        // compiler error: bad return type in lambda expression float can't be converted to String
//        System.out.println(p.printCustom(p1 -> 20.0f));
        // As per the functional interface we declared for printcustom method in person class above, Function<Person, String>
        // this interface takes Person object as lambda parameter and returns String

//        //Runtime error: Object can't cast to String
//        System.out.println(p.printCustom(p1 -> (String)new Object()));

        // It is Ok now
        System.out.println(p.printCustom(p1 -> p.name+" "+p.email));
        System.out.println(p.printCustom(Person::printEastern));
    }
}
