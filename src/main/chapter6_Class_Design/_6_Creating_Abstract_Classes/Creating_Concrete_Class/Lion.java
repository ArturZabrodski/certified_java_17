package main.chapter6_Class_Design._6_Creating_Abstract_Classes.Creating_Concrete_Class;

// конкретный класс должен реализовать все методы абстрактного класса

public class Lion extends BigCat {
    public String getName() {
        return "Lion";
    }

    public void roar() {
        System.out.println("The Lion lets out a loud ROAR!");
    }
}
