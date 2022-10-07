package main.chapter8_Lambdas_and_Functional_Interfaces._3_Using_Method_References._2_Calling_Instance_Methods_on_a_Particular_Object;

/**
 * В этом примере наш функциональный интерфейс проверяет,
 * начинается ли строка с указанного значения:
 */

interface StringStart {
    boolean beginningCheck(String prefix);
}

class Main1 {
    public static void main(String[] args) {
        var str = "Zoo";
        StringStart methodRef = str::startsWith; // показывает, что мы хотим вызвать str.StartsWith()
                                                 // и передать один параметр, который будет предоставлен
                                                 // во время выполнения.
        StringStart lambda = s -> str.startsWith(s);

        System.out.println(methodRef.beginningCheck("A")); // false
    }
}
