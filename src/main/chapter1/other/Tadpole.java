package main.chapter1.other;

import main.chapter1.animal.Frog;

public class Tadpole extends Frog {
    public static void main(String[] args) {
        Tadpole t = new Tadpole();
        t.ribbit(); // видим т.к. protected
//        t.jump();  // не видим, т.к. по умолчанию и в другом пакете
        Frog f = new Tadpole();
//        f.ribbit(); // не видит. т.к. в другом пакете
//        f.jump();   // не видит. т.к. в другом пакете
    }
}