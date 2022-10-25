package main.chapter9_Collections_and_Generics._2_Sorting_Data._1_Creating_a_Comparable_Class.ex3;

public class Product implements Comparable<Product> {
    private int id;
    private String name;

    public int hashCode() {
        return id;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Product)) return false;
        var other = (Product) obj;
        return this.id == other.id;
    }

    public int compareTo(Product obj) {
        return this.name.compareTo(obj.name);
    }
}