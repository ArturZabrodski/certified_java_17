package main.chapter6_Class_Design._other.ex5;

public class Student extends Person {
    private int avrMark;

    public Student(String name, Integer age, int avrMark) {
        super(name, age);
        this.avrMark = avrMark;
    }

    @Override
    public void test(){
        System.out.println("class Student");
    }
}
