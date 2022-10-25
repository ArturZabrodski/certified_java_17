package main.chapter9_Collections_and_Generics._3_Workink_with_Generics.Wildcards;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test1(listOfAnimal);
        test1(listOfDogs);

        test2(listOfAnimal);
        test2(listOfDogs);

        test3(listOfAnimal);
//        test3(listOfDogs); // не можем передать

        test4(listOfAnimal);
        test4(listOfDogs);

        test5(listOfAnimal);
//        test5(listOfDogs); // не можем передать
    }

    private static void test1(List<? extends Animal> animals) { // можем передать list класса Animal и Dog
        System.out.println("Test 1:");
        for (Animal animal : animals) {
            System.out.println(animal);
            animal.eat();
        }
        System.out.println();
    }

    private static void test2(List<?> animals) { // можем передать list любого класса
        System.out.println("Test 2:");
        for (Object animal : animals) {
            System.out.println(animal);
//            animal.eat(); // ошибка
        }
        System.out.println();
    }

    private static void test3(List<? super Animal> animals) { // можем передать list Animal и классов, которые выше Animal
        System.out.println("Test 3:");
        for (Object animal : animals) {
            System.out.println(animal);
//            animal.eat(); // ошибка
        }
        System.out.println();
    }

    private static void test4(List<? super Dog> animals) { // можем передать list Dog и классов, которые выше Dog
        System.out.println("Test 4:");
        for (Object animal : animals) {
            System.out.println(animal);
//            animal.eat(); // ошибка
        }
        System.out.println();
    }

    private static void test5(List<Animal> animals) { // можем передать только list Animal
        System.out.println("Test 5:");
        for (Animal animal : animals) {
            System.out.println(animal);
            animal.eat();
        }
        System.out.println();
    }
}
