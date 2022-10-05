package main.chapter8._3_Using_Method_References._2_Calling_Instance_Methods_on_a_Particular_Object;

interface StringChecker {
    boolean check();
}

class Main2 {
    public static void main(String[] args) {
        var str = "";
        StringChecker methodRef = str::isEmpty;
        StringChecker lambda = () -> str.isEmpty();

        System.out.println(methodRef.check()); // true

        var str1 = "";
        StringChecker lambda1 = () -> str1.startsWith("Zoo");
        System.out.println(lambda1.check());    // false

        // Ни то, ни другое не работает! Хотя мы можем передать str как часть ссылки на метод,
        // нет никакого способа передать с ним параметр "Zoo". Следовательно, невозможно записать эту
        // лямбду в качестве ссылки на метод.

//        StringChecker methodReference = str::startsWith; // DOES NOT COMPILE
//        StringChecker methodReference = str::startsWith("Zoo"); // DOES NOT COMPILE
    }
}