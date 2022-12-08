package main.tests.classes._5;

public class Test {
    static String text = "foo";   // эта переменная не используется

    public static void main(String[] args) {
        String text = "bar";

        if (text.equals("foo")) {
//          String text = "fuz";  // такая переменная уже существует глобально, будет ошибка компиляции
            text = "fuz";
        } else {
//          String text = "baz";  // такая переменная уже существует глобально, будет ошибка компиляции
            text = "baz";
        }
        System.out.println(text);      // baz
        System.out.println(Test.text); // foo
    }
}
