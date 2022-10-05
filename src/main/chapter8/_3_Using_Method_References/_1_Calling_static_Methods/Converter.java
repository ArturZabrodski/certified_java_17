package main.chapter8._3_Using_Method_References._1_Calling_static_Methods;

interface Converter {
    long round(double num);
}

class Main {
    public static void main(String[] args) {
        Converter methodRef = Math::round;
        Converter lambda = x -> Math.round(x);

        System.out.println(methodRef.round(100.1)); // 100
    }
}