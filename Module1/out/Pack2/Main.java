package Pack2;

import Pack1.Greeting;
import Pack1.Student;

public class Main {
    public static void main(String[] args) {
        Greeting.sayHello();

        Student student = new Student();
        student.setName("Aayush");
        student.setAge(20);

        System.out.println("Student name: " + student.getName());
        System.out.println("Formatted name: " + student.getFormattedName());
        System.out.println("Student age: " + student.getAge());
    }
}
