package main.tests.cycle;

public class Program0 {
    public static void main(String[] args) {
        Program0 test = new Program0();
        test.loop(0);

    }

    void loop(int number) {
        while (number > 5) {
            number++;
            continue;
//            System.out.println(number + " ");  //  unreachable statement
        }
    }

}
