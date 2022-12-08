package main.tests.classes._8.bar;

import main.tests.classes._8.foo.MyFoo;

public class MyBar extends MyFoo {

    // когда метод не переопределен, он все равно существует в таком виде
    @Override
    protected void printText() {
        super.printText();
    }

    private String text = "Bar";

    public static void main(String[] args) {
        MyBar myBar = new MyBar();
        myBar.printText();              // Foo, ызываем super.printText();
        System.out.println(myBar.text); // Bar

    }
}
