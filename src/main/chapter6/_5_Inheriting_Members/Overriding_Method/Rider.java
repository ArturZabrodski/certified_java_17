package main.chapter6._5_Inheriting_Members.Overriding_Method;

public class Rider {
    public static void main(String[] args) {
        Camel c = new BactrianCamel();
        System.out.print(c.getNumberOfHumps()); // ???
    }
}
