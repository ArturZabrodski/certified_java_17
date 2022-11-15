package main.chapter11_Exception_and_Localization._1_Understanding_Exceptions.ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * обработка исключений через try-catch
 */

public class Exception1 {
    public static void main(String[] args) {
//        File file = new File("asdf");          // этот файл не существует
        File file = new File("test");   // этот файл существует

        try {                                              // этот блок выполняется когда файл найден
            Scanner scanner = new Scanner(file);
            System.out.println("После Scanner'a");
        } catch (FileNotFoundException e) {                // этот блок выполняется когда файл не найден
            System.out.println("Файл не найден");
        }

        System.out.println("После блока try-catch");      // этот блок выполняется всегда
    }
}
