package Objects;

class TestData {
    String name;

    TestData(String name) {
        this.name = name;
    }

//    public String toString() {
//        return this.name;
//    }
}

public class GCQuiz {
    public static void main(String[] args) {
        TestData t0 = createObjects(); // t0 holds object Mary address
        System.out.println(t0);
    }

    private static TestData createObjects() {
        TestData t1 = new TestData("Mary");  // Object 1 = Mary
        TestData t2 = new TestData("Nancy");
        TestData t3 = new TestData("Owen");
        TestData t4 = new TestData("Ralph");
        System.out.println("t1: "+t1);
        System.out.println("t2: "+t2);
        System.out.println("t3: "+t3);
        System.out.println("t4: "+t4);

        t3 = t4 = t1;   // Line 1 here t3, t4 and t1 points to same object Mary
        System.out.println("t1: "+t1);
        System.out.println("t2: "+t2);
        System.out.println("t3: "+t3);
        System.out.println("t4: "+t4);
        t1 = t2 = null;  // Line 2 here t1 and t2 references goes null so they no longer point to the object Mary
        t4 = null;  // Line 3 // t4 is null means t4 no longer refers to Object Mary
        return t3;  // Line 4 t3 still refers to Object Mary
    }
}
