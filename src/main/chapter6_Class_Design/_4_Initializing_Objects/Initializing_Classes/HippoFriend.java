package main.chapter6_Class_Design._4_Initializing_Objects.Initializing_Classes;

/**
 * Предполагая, что на класс больше нигде нет ссылок, эта программа напечатает CAB, при
 * этом класс Hippo не будет загружен до тех пор, пока он не понадобится внутри метода main().
 */

public class HippoFriend {
    public static void main(String[] grass) {
        System.out.print("C");
        new Hippo();
    }
}