package main.chapter1;

public class Program {
    public static void main(String[] args) {
        var num1 = Long.parseLong("100");
        var num2 = Long.valueOf("100");
//        System.out.println(Long.max(num1, num2));

        String pyramid = """
                  *
                 * *
                * * *
                """;
        System.out.print(pyramid);

        System.out.println();

        String block = """
                "doe\"\"\"
                \"deer\"""
                """;
        System.out.print("*" + block + "*");

//        var i;
        var i = "text";

        i = "fdsfsdf";

//        int a = 5, var b = 6;
        int a = 5;
        var b = 6;
        var у = new Bird();
        int amount = 0xE;
        double amount2 = 9_2.1_2;
        int amount3 = 0b101;
        float amount4 = 12_3.3_3F;


        int f = -5;
        int n = ~f;
        System.out.println("\n" +  n);

        int stripes = 7;

        System.out.println((stripes < 9) ? 3 : "Horse");

//        int animal = (stripes < 9) ? 3 : "Horse";   // DOES NOT COMPILE
    }


//    public int addition(var a, var b) { // DOES NOT COMPILE
//        return a + b;
//    }



//    public void doesThisCompile(boolean check) {
//        var question; // должно присваиваться значение
//        question = 1;
//        var answer;   // должно присваиваться значение
//
//        if (check) {
//            answer = 2;
//        } else {
//            answer = 3;
//        }
//        System.out.println(answer);
//    }

}
