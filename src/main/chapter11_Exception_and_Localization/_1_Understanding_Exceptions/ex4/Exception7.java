package main.chapter11_Exception_and_Localization._1_Understanding_Exceptions.ex4;

import java.io.IOException;
import java.text.ParseException;

public class Exception7 {
    // IllegalArgumentException не добавляем, т.к. он наследуется от IOException
    public static void main(String[] args) throws ParseException, IOException {
            run();
    }
    public static void run() throws IOException, ParseException, IllegalArgumentException {
    }
}
