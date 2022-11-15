package main.chapter11_Exception_and_Localization._1_Understanding_Exceptions._2_Calling_Methods_That_Throw_Exceptions;

public class Exception1 {
//    public static void main(String[] args) {
//        eatCarrot(); // DOES NOT COMPILE, т.к. не обработано
//    }

    public static void main(String[] args) throws NoMoreCarrotsException { // обработано
        eatCarrot();
    }
    private static void eatCarrot() throws NoMoreCarrotsException {}
}
