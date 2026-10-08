package Constructor;

public class Student {
    private final String name;
    private final int age;
    private final String course;

    public Student() {
        this("Unknown", 0, "Not assigned");
    }

    public Student(String name) {
        this(name, 0, "Not assigned");
    }

    public Student(String name, int age) {
        this(name, age, "Not assigned");
    }

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.displayDetails();
    }
}