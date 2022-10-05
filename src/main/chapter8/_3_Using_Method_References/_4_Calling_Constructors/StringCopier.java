package main.chapter8._3_Using_Method_References._4_Calling_Constructors;

interface StringCopier {
    String copy(String value);
}

class Main6 {
    public static void main(String[] args) {
        StringCopier methodRef = String::new;
        StringCopier lambda = x -> new String(x);

        var myString = methodRef.copy("Zebra");
        System.out.println(myString.equals("Zebra"));       // true
    }
}