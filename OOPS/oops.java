package OOPS;

class Student {
    String name;
    int age;

    // public void printInfo() {
    // System.out.println(this.name);
    // System.out.println(this.age);
    // }

    // POLYMORPHISM
    // function overloading
    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }

    // copy constructor
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    // non parametrized constructor
    Student() {
        System.out.println("Constructor called");
    }
}

class Marks extends Student {

}

public class oops {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "manoj";
        s1.age = 19;

        Marks m1 = new Marks();

        Student s2 = new Student(s1);
        s2.printInfo(s2.name, s2.age);

    }
}