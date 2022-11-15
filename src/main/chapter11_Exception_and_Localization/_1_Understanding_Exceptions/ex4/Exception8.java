package main.chapter11_Exception_and_Localization._1_Understanding_Exceptions.ex4;

import java.io.IOException;
import java.text.ParseException;

public class Exception8 {
    public static void main(String[] args) {
        try {
            run();
        } catch (IOException | ParseException e) {  // когда несколько исключений обрабатываются одинаково
            e.printStackTrace();
        }
    }

    public static void run() throws IOException, ParseException, IllegalArgumentException {
    }
}
