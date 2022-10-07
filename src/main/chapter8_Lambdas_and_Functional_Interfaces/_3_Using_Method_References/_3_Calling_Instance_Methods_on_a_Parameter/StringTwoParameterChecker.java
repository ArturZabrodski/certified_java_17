package main.chapter8_Lambdas_and_Functional_Interfaces._3_Using_Method_References._3_Calling_Instance_Methods_on_a_Parameter;

interface StringTwoParameterChecker {
    boolean check(String text, String prefix);
}

class Main4{
    public static void main(String[] args) {
        StringTwoParameterChecker methodRef = String::startsWith;
        StringTwoParameterChecker lambda = (s, p) -> s.startsWith(p);

        System.out.println(methodRef.check("Zoo", "A")); // false
    }
}