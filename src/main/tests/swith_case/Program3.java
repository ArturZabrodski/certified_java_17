package main.tests.swith_case;

public class Program3 {
    public static void main(String[] args) {
        String text;

        Program3 test = new Program3();
        String text1 = test.convert('a');
        String text2 = test.convert('b');

        System.out.println(text1 + text2);  // BB
    }

    String convert(char character) {
//        String text;      // переменная должна быть хотя бы null
        String text = null;

        switch (character) {
            case 'a':
                text = "A";
            case 'b':
                text = "B";
                break;
            case 'c':
                text = "C";
        }
        return text;
    }
}
