package main.chapter8_Lambdas_and_Functional_Interfaces._5_Working_with_Variables_in_Lambdas;

/**
 * блок может содержать все, что допустимо в обычном блоке Java, включая локальные
 * объявления с возможностью изменения. Следующий код делает именно это. Он создает
 * локальную переменную с именем "c", область действия которой ограничена лямбда-блоком:
 */

public class Example1 {
    public static void main(String[] args) {

//        (a, b)- > { int c = 0; return 5; } // does not compile

//        public void variables (int a){
//            int b = 1;
//            Predicate<Integer> p1 = a -> {  // повторное объявление переменной
//                int b = 0;  // повторное объявление переменной
//                int c = 0;
//                return b == c;
//            } // не хватает ;
//        }

        // аналогичный код
//        Predicate<Integer> p1 = a -> returnSame(a);
//        Predicate<Integer> p1 = this::returnSame;
    }
}
