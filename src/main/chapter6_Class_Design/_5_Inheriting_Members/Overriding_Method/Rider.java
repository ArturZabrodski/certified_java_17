package main.chapter6_Class_Design._5_Inheriting_Members.Overriding_Method;

public class Rider {
    public static void main(String[] args) {
        Camel c = new BactrianCamel();
        System.out.print(c.getNumberOfHumps()); // ???
    }
}
