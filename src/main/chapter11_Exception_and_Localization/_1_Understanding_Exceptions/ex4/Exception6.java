package main.chapter11_Exception_and_Localization._1_Understanding_Exceptions.ex4;

import java.io.IOException;
import java.text.ParseException;

public class Exception6 {
    public static void main(String[] args) {
        try {
            run();
        } catch (IOException e) {           // несколько catch блоков для разных исключений
            System.out.println("IOException");
        } catch (ParseException e) {
            System.out.println("ParseException");
        }
    }

    public static void run() throws IOException, ParseException, IllegalArgumentException {
    }
}
