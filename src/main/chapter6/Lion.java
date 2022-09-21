package main.chapter6;

public class Lion extends Animal {
    protected void setProperties(int age, String n) {
        setAge(age);
        name = n;
    }

    public void roar() {
        System.out.print(name + ", age " + getAge() + ", says: Roar!");
    }

// Переменная age существует в родительском классе Animal и не доступна напрямую в дочернем классе Lion.
//    public void roar() {
//        System.out.print("Lions age: " + age); // DOES NOT COMPILE
//    }

    public static void main(String[] args) {
        var lion = new Lion();
        lion.setProperties(3, "kion");
        lion.roar();
    }
}