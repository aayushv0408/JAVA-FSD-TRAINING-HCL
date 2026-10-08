package Module1.OPPS;

import coreJavaFoundation.Abc;

public class Demo extends Abc {

    public Demo() {
        System.out.println("Demo constructor called.");
        callPrivateMethod();
    }

    public static void main(String[] args) {
        new Demo();
    }
}
