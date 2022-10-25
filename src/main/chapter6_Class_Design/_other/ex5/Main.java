package main.chapter6_Class_Design._other.ex5;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Jack", 25, 1);
        student.test();  // class Student, т.к. в классе Student этот метод переопределен

        Person student1 = new Student("Jack", 25, 1);
        student1.test();  // class Student


        Teacher teacher = new Teacher("Bob", 40, "Android Developer");
        teacher.test();  // class Person, т.к. в классе Teacher этот метод не переопределен

        Person teacher1 = new Teacher("Bob", 40, "Android Developer");
        teacher1.test();  // class Person

    }
}
