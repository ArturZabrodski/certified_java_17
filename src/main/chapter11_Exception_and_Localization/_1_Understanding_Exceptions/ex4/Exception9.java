package main.chapter11_Exception_and_Localization._1_Understanding_Exceptions.ex4;

import java.io.IOException;
import java.text.ParseException;

public class Exception9 {
    public static void main(String[] args) {
        try {
            run();
        } catch (Exception e) {
            System.out.println("Exception");
//        } catch (ParseException e) {            // в эту строку кода мы никогда не попадем, т.к.
//                                                // ParseException наследуется от Exception
//            System.out.println("ParseException");
        }
    }

    public static void run() throws ParseException, IllegalArgumentException {
    }
}
