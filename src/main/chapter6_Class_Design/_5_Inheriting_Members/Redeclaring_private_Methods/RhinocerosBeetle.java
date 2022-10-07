package main.chapter6_Class_Design._5_Inheriting_Members.Redeclaring_private_Methods;

public class RhinocerosBeetle extends Beetle {
    private int getSize() { // этот метод не переопределяет метод из родительского класса
        return 5;           // т.к. private методы не наследуются
    }

    public static void main(String[] args) {
        RhinocerosBeetle r = new RhinocerosBeetle();

        System.out.println(r.getSize());
    }
}
