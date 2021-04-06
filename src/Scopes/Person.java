package Scopes;

public class Person {
    static String name="UNKNOWN";
    int age;
    String instanceName;
    Person(){
    }
    Person(int age, String name){
        age=age; // it won't assign to instance variable we need this for the left hand variable this.a = a
        instanceName = name;
    }

    Person(int age){
        instanceName = Person.name;
        this.age = age;
    }

    public String toString(){
        return instanceName+" is "+age+" years Old";
    }
}
