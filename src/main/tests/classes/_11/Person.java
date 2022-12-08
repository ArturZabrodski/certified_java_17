package main.tests.classes._11;

public class Person {
    String name;
    int age;

    @Override
    public String toString() {
        return name + ": " + age;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.name = "John";
        person.age = 30;

        String str = String.valueOf(person);

        person.name = "Jane";
        person.age = 20;

        System.out.println(str);      // John: 30

        Person person1 = person;
        System.out.println(person1);  // Jane: 20
    }
}
