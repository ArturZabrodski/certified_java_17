package main.chapter6_Class_Design._other.ex5;

public class Teacher extends Person{
    private String qualification;

    public Teacher(String name, Integer age, String qualification) {
        super(name, age);
        this.qualification = qualification;
    }
}
