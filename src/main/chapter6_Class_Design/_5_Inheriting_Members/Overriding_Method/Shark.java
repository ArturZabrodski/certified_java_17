package main.chapter6_Class_Design._5_Inheriting_Members.Overriding_Method;

/**
 * Вы можете использовать аннотацию @Override, чтобы сообщить компилятору, что вы пытаетесь
 * переопределить метод. При правильном использовании аннотация не влияет на код. С другой стороны, при
 * неправильном использовании эта аннотация может уберечь вас от ошибки.
 */

public class Shark extends Fish {
    @Override
    public void swim() {
    }
}
