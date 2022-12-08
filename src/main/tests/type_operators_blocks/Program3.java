package main.tests.type_operators_blocks;

public class Program3 {
    public static void main(String[] args) {
        Program3 test = new Program3();
        int number = test.decrease(10); // возвращается 0
        number -= number-- - --number;          // 0 - (0 - (-2)) = -2
        System.out.println(number);
    }

    int decrease(int number) {
        return --number - number--;
    }
}
