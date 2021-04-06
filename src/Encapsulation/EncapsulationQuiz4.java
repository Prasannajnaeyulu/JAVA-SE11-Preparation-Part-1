package Encapsulation;

//There are no accessor methods for weight or somethingForNothing. Although there is a method named getSomethingForNothing,
// it returns void and is therefore not an accessor method. A bean property is something returned from an accessor method and
// is not necessarily a variable defined by the class. An accessor method is either prefixed with 'get' for any return type or
// 'is' for a boolean. Note that 'get' also works with a boolean. An accessor method cannot have a return type of void.
// An accessor is not required to return a defined class or instance variable.

//Which of the following would NOT be a property in a bean inspection tool?
// Ans: weight and somethingForNothing because there exists no getter method for these so they wouldn't be a bean property
public class EncapsulationQuiz4 {
    private int counter;
    private boolean running;
    private String name;
    private int weight;
    private int somethingForNothing;

    public int getCounter() {
        return counter;
    }

    public boolean isRunning() {
        return running;
    }

    public String getName() {
        return name;
    }

    public int getDressSize() {
        return weight / 10;
    }

    public boolean getSpecial() {
        return true;
    }

    public void getSomethingForNothing() {
        return;
    }
}
