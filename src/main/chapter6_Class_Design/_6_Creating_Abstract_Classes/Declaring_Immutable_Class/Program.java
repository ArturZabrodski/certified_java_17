package main.chapter6_Class_Design._6_Creating_Abstract_Classes.Declaring_Immutable_Class;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        var zebra = new Animal();
        System.out.println(zebra.getFavoriteFoods()); // [Apples]
        zebra.getFavoriteFoods().clear();
        zebra.getFavoriteFoods().add("Chocolate Chip Cookies");
        System.out.println(zebra.getFavoriteFoods()); // [Chocolate Chip Cookies]

        System.out.println();

        var favorites = new ArrayList<String>();
        favorites.add("Apples");
        var zebra2 = new Animal2(favorites); // Caller still has access to favorites
        System.out.println(zebra2.getFavoriteFoodsItem(0)); // Apples
        favorites.clear();
        favorites.add("Chocolate Chip Cookies");
        System.out.println(zebra2.getFavoriteFoodsItem(0)); // Apples
    }
}
