package coreJavaFoundation;

public class Abc {
    public void showMessage() {
        System.out.println("Abc method called through inheritance.");
    }

    public void callPrivateMethod() {
        showMessage();
    }
}