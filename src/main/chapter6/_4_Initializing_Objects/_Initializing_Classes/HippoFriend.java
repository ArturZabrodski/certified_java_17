package main.chapter6._4_Initializing_Objects._Initializing_Classes;

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