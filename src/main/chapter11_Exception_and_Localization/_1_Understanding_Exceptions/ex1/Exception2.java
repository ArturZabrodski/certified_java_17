package main.chapter11_Exception_and_Localization._1_Understanding_Exceptions.ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * обработка исключений через try-catch и выбрасывание throws Exception
 */

public class Exception2 {
    public static void main(String[] args) {
        // здесь можно также по иерархии вверх обрабатывать, а можно через try-catch
        try {
            readFile();
            System.out.println("Обработка исключения в методе readFile");
        } catch (FileNotFoundException e) {
            // исключения нужно обрабатывать чтобы был дружелюбный текст
            System.out.println("Обработка исключения в методе main");
        }
    }


    public static void readFile() throws FileNotFoundException {  // обрабатываем исключение
        File file = new File("test");
//        File file = new File("adcf");
        Scanner scanner = new Scanner(file);
    }
}

