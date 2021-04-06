package Packages.a;
import Packages.a.d.StaticImportTest1;
import Packages.a.e.StaticImportTest2;
import Packages.a.d.*;
import static Packages.a.d.StaticImportTest1.*;
import Packages.a.e.*;
// compiler error static import should be class methods or variables but not direct class
//import static StaticImportTest2;
import static Packages.a.e.StaticImportTest2.APP_NAME;

public class StaticImportTestMain {
    public static void main(String... args){
        System.out.println(APP_NAME);
        log("Hello");
        StaticImportTest1.main();
        StaticImportTest2.main();
    }
}
