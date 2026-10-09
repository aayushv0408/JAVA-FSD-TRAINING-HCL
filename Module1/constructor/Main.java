// package Constructor;

// public class Main {

//     public static void main(String[] args) {
//         Student defaultStudent = new Student();
//         Student namedStudent = new Student("Aayush");
//         Student studentWithAge = new Student("Rahul", 20);
//         Student completeStudent = new Student("Priya", 21, "Computer Science");

//         defaultStudent.displayDetails();
//         namedStudent.displayDetails();
//         studentWithAge.displayDetails();
//         completeStudent.displayDetails();
//     }
// }




// package Constructor;

// import OPPS.A;

// public class Main {

//     public static void main(String[] args) {

//         A obj1 = new A();

//         A obj2 = new A(10);

//         A obj3 = new A(10, 20);
//     }
// }









// package Constructor;

// import OPPS.Child;

// public class Main {

//     public static void main(String[] args) {

//         Child obj = new Child();

//         obj.show();
//         obj.display();
//         obj.hello();
//     }
// }




package constructor;

import OPPS.Parent;
import OPPS.Child;

public class Main {

    public static void main(String[] args) {

        Parent.show();
        Child.show();

        Parent p = new Child();

        p.show();
    }
}