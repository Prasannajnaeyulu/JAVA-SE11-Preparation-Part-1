package Classes;

class Super{
    Super(){
        System.out.println("Super class constructor");
    }
    static{
        System.out.println("Super class static initialization block");
    }
    {
        System.out.println("Super class instance initialization block");
    }
}
public class InitializerBlocks extends Super{
    // When Object is being created,
    // 1. It executes static initialization statements, static blocks of super class first in the order they appear
    // 2. executes static initialization statements, static blocks of this class in the order they appear
    // 3. super class instance initializer blocks in the order they appear
    // 4. super class constructor and then this class instance initializer blocks at last this class constructor

    // When class is accessed using class Name to call some static method
    // For example, InitializerBlocks.classOrder() is called from the main() method, then
    // 1. It executes super class static initializations and static initializer blocks in the order they appear
    // 2. then this class static initializations and static initializer blocks in the order they appear
    // But NO non-static initialization or initialization blocks will be executed
    static int a = classOrder("assigning a variable");
    int b;
    static int classOrder(String s) {
        System.out.println(s);
        return 1;
    }
    InitializerBlocks(){
        classOrder("Constructor..");
    }
    // static initializerBlock
    static{
        classOrder("Static Initializer block");
    }
    // instance initializerBlock
    {
        classOrder("Instance Initializer block");
        this.a = 10;
        this.b = 30;
    }
    {
        classOrder("Instance Initializer block2");
        this.a = 20;
        this.b = 40;
    }
    static{
        classOrder("Static Initializer block2");
    }
    public static void main(String... args){
        // When this is executed it prints
//        Super class static initialization block
//        assigning a variable
//        Static Initializer block
//        Static Initializer block2
//        Super class instance initialization block
//        Super class constructor
//        Instance Initializer block
//        Instance Initializer block2
//        Constructor..
//        InitializerBlocks initBlocks = new InitializerBlocks();

        //When this is executed it prints
//        Super class static initialization block
//        assigning a variable
//        Static Initializer block
//        Static Initializer block2
//        hello

        InitializerBlocks.classOrder("hello");
    }
}
