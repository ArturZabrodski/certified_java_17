package main.chapter11_Exception_and_Localization._1_Understanding_Exceptions._2_Calling_Methods_That_Throw_Exceptions;

public class Exception2 {

    public static void main(String[] args) {
        try {
            eatCarrot();        // обработано через try-catch
        } catch (NoMoreCarrotsException e) {
            System.out.print("sad rabbit");
        }
    }

     private static void eatCarrot() throws NoMoreCarrotsException {}
}
