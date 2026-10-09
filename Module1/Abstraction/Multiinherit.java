package Abstraction;

interface A {
    void show();
}

interface B {
    void display();
}

class C implements A, B {

    @Override
    public void show() {
        System.out.println("A interface method");
    }

    @Override
    public void display() {
        System.out.println("B interface method");
    }
}

public class Multiinherit {

    public static void main(String[] args) {

        C obj = new C();

        obj.show();
        obj.display();
    }
}