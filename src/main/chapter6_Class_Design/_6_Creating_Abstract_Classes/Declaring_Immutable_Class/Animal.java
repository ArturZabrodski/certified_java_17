package main.chapter6_Class_Design._6_Creating_Abstract_Classes.Declaring_Immutable_Class;

import java.util.ArrayList;
import java.util.List;

public final class Animal { // Not an immutable object declaration
    private final ArrayList<String> favoriteFoods;

    public Animal() {
        this.favoriteFoods = new ArrayList<String>();
        this.favoriteFoods.add("Apples");
    }

    public List<String> getFavoriteFoods() {
        return favoriteFoods;
    }
}