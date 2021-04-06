package Packages.a.c;

import java.lang.*; // this is redundant but will compile

import Packages.a.b.PackageTests;

public class ImportTests {
    public static void main(String... args){
        System.out.println("Import tests");
        PackageTests.main();
    }
}
