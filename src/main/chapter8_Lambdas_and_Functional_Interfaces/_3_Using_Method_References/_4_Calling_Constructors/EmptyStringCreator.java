package main.chapter8_Lambdas_and_Functional_Interfaces._3_Using_Method_References._4_Calling_Constructors;

interface EmptyStringCreator {
    String create();
}

class Main5 {
    public static void main(String[] args) {
        EmptyStringCreator methodRef = String::new;
        EmptyStringCreator lambda = () -> new String();

        var myString = methodRef.create();
        System.out.println(myString.equals("Snake")); // false
    }
}
