package main.chapter6_Class_Design._6_Creating_Abstract_Classes.Declaring_Immutable_Class;

import java.util.ArrayList;
import java.util.List;

public final class Animal2 { // An immutable object declaration
    private final List<String> favoriteFoods;

    public Animal2(List<String> favoriteFoods) {
        if (favoriteFoods == null || favoriteFoods.size() == 0)
            throw new RuntimeException("favoriteFoods is required");
        this.favoriteFoods = new ArrayList<String>(favoriteFoods);
    }

    public int getFavoriteFoodsCount() {
        return favoriteFoods.size();
    }

    public String getFavoriteFoodsItem(int index) {
        return favoriteFoods.get(index);
    }
}