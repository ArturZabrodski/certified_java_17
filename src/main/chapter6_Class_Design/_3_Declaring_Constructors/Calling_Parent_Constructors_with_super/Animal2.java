package main.chapter6_Class_Design._3_Declaring_Constructors.Calling_Parent_Constructors_with_super;

public class Animal2 {
    private int age;
    private String name;

    public Animal2(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }

    public Animal2(int age) {
        super();
        this.age = age;
        this.name = null;
    }
}
