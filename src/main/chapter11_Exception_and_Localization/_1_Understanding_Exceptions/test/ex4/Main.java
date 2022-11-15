package main.chapter11_Exception_and_Localization._1_Understanding_Exceptions.test.ex4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {
//        Main main = new Main();
//        main.tryAgain("text");

        Locale.setDefault(new Locale("en", "US"));
        var b = ResourceBundle.getBundle("Dolphins");
        System.out.println(b.getString("name"));
    }
//    public void tryAgain(String s) {
//       try (FileReader r = null, p = new FileReader("")) { // нет типа параметра
//            System.out.print("X");
//            throw new IllegalArgumentException();
//            } catch (Exception s) {
//            System.out.print("A");
//            throw new FileNotFoundException();
//            } finally {
//            System.out.print("O");
//            }
//        }
}
