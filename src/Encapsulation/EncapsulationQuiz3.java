//package Encapsulation;
//
//public class EncapsulationQuiz3 {
//}
//
//package pkgb;
// Access modifier of SuperClass is package private
//class SuperClass {
//    public void printPublicData(String data) {
//        System.out.println(data);
//    }
//    void printPackageData(String data) {
//        System.out.println(data);
//    }
//    protected void printProtectedData(String data) {
//        System.out.println(data);
//    }
//    private void printPrivateData(String data) {
//        System.out.println(data);
//    }
//}
//package pkga;
//
//import pkgb.SuperClass;
// Access modifier of SuperClass is package private so you can't access superclass from different package
//public class TestClass extends SuperClass {
//    public static void main(String[] args) {
//
//        //** Insert code here **/
//    }
//}