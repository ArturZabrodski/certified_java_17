package main.chapter11_Exception_and_Localization._1_Understanding_Exceptions.ex3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Checked Exception (Compile time exception) - исключительные случаи в работе программы
 * Unchecked Exception (Runtime exception) - ошибки в работе программы
 */

public class Exception5 {
    public static void main(String[] args) {

        File file = new File("test");

        // Checked Exception
        try {
            Scanner scanner = new Scanner(file);
            System.out.println("success, file found");
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }

        // Unchecked Exception

//        int a = 1 / 0;                // ArithmeticException


//        String name = null;
//        name.length();               // NullPointerException


//        int[]arr = new int[2];
//        System.out.println(arr[2]);  // ArrayIndexOutOfBoundsException
    }
}
