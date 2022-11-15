package main.chapter11_Exception_and_Localization._1_Understanding_Exceptions._1_Throwing_an_Exception;

/**
 * Ключевое слово throw используется в качестве инструкции внутри блока кода для создания нового исключения
 * или повторного создания существующего исключения, в то время как ключевое слово throws используется только в конце
 * объявления метода, чтобы указать, какие исключения он поддерживает
 */

public class Main2 {
    public static void main(String[] args) {

        String[] animals = new String[0];
        System.out.println(animals[0]); // ArrayIndexOutOfBoundsException


        // можно явно запросить
//        throw new Exception();
//        throw new Exception("Ow! I fell.");
//        throw new RuntimeException();
//        throw new RuntimeException("Ow! I fell.");


        // исключение - это объект
        var exc = new RuntimeException();
        throw exc;


//        throw RuntimeException(); // DOES NOT COMPILE, не хватает new


//         Компилятор распознает это и сообщает об ошибке недоступного кода.
//        try {
//            throw new RuntimeException(); // Поскольку эта строка выдает исключение
//            throw new ArrayIndexOutOfBoundsException(); // DOES NOT COMPILE, эта срока никогда не выполнится
//        } catch (Exception e) {
//        }
    }
}
