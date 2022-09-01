package main.test0_1;

// 5. What is the result of the following program?
//        A. 10
//        +B. 15
//        C. 25
//        D. Compiler error on line 3
//        E. Compiler error on line 8
//        F. None of the above
public class MathFunctions {
    public static void addToInt(int x, int amountToAdd) {
        x = x + amountToAdd;
    }

    public static void main(String[] args) {
        var a = 15;
        var b = 10;
        addToInt(a, b);
        System.out.println(a);
    }
}
