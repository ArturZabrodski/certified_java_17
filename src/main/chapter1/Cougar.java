package main.chapter1;

// 10. What is the output of the following program? (Choose all that apply.)

// 1: interface HasTail { private int getTailLength(); }

interface HasTail {
    private int getTailLength() {
        return 0;
    }
}

abstract class Puma implements HasTail {
    String getTailLength() {
        return "4";
    }
}

public class Cougar implements HasTail {
    public static void main(String[] args) {
        var puma = new Puma() {};
        System.out.println(puma.getTailLength());
    }

    public int getTailLength(int length) {
        return 2;
    }
}
