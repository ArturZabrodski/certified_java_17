package main.tests.classes._10;

public class Test {
    static void methodA() {
//        this.methodB(); // можно использовать this, если methodA будет не static
        new Test().methodB();
    }

    void methodB() {
//        this.methodC(); // таким образом метод также вызывается
        methodC();
    }

    static void methodC() {
        System.out.println("Hello");
    }
}

class Main {
    public static void main(String[] args) {
        Test.methodA();
    }
}
