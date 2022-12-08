package main.tests.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Program1 {
    public static void main(String[] args) {
        try {
            throw new FileNotFoundException();
//        } catch (Exception | IOException e) {  // Compilation fails
        } catch (Exception e) {
            if (e instanceof FileNotFoundException) {
                System.out.println("FileNotFoundException");  // сработает
            } else if (e instanceof IOException) {
                System.out.println("IOException");
            } else if (e instanceof Exception) {
                System.out.println("Exception");
            }
        }
    }
// FileNotFoundException
}
