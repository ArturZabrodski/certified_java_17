package main.chapter11_Exception_and_Localization._1_Understanding_Exceptions.ex2;

/**
 * создаем свое исключение
 */

public class ScannerException extends Exception{

    public ScannerException(String description) {
        super(description);
    }
}
