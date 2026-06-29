package s129.practical.no.pkg1;

class Student {
    String name;
    int age;

    Student() {
        name = "Aditya";
        age = 22;
    }

    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    void display(String course) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    static void collegeName() {
        System.out.println("MVLU COLLEGE");
    }
}

public class S129PracticalNo1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Sahil", 69);

        Student.collegeName();

        s1.display();
        s2.display("Computer Science");
    }
}