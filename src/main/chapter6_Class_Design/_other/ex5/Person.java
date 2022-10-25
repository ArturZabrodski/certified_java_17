package main.chapter6_Class_Design._other.ex5;

//public final class Person { // от класса final нельзя наследоваться
public class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

//    public final void test(){ // будет ошибка компиляции в дочернем классе, т.к. нельзя переопределить метод final
    public void test(){
        System.out.println("class Person");
    }
}
