package main.chapter6._6_Creating_Abstract_Classes._Introducing_Abstract_Classes;

/**
 * Абстрактный класс - это класс, объявленный с модификатором abstract, который
 * не может быть создан напрямую и может содержать абстрактные методы.
 */

public abstract class Canine {
    public abstract String getSound();

    public void bark() {
        System.out.println(getSound());
    }
}
