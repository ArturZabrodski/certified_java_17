package main.chapter8_Lambdas_and_Functional_Interfaces._3_Using_Method_References._3_Calling_Instance_Methods_on_a_Parameter;

interface StringParameterChecker {
    boolean check(String text);
}

class Main3 {
    public static void main(String[] args) {
        StringParameterChecker methodRef = String::isEmpty;
        StringParameterChecker lambda = s -> s.isEmpty();

        System.out.println(methodRef.check("Zoo")); // false
    }
}