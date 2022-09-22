package main.chapter6._5_Inheriting_Members._Overriding_Method;

import main.chapter6._5_Inheriting_Members._Overriding_Method.BactrianCamel;
import main.chapter6._5_Inheriting_Members._Overriding_Method.Camel;

public class Rider {
    public static void main(String[] args) {
        Camel c = new BactrianCamel();
        System.out.print(c.getNumberOfHumps()); // ???
    }
}
