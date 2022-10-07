package main.chapter6_Class_Design._2_Creating_Classes;

public class Animal {
    private int age;
    protected String name;

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        age = newAge;
    }
    private void roar() {
        System.out.print("Animal");
    }
}