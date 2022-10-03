package main.chapter7._1_Interfaces._1_Implementing_Interfaces;

public class FieldMouse implements Climb {
    public Float getSpeed(int age) {
        return 11f;
    }

    public Float getRun(int age) {
        return 20f;
    }

    public static void main(String[] args) {
        Climb c = new FieldMouse();
        System.out.println(c.getSpeed(5)); // 11.0
//      System.out.println(c.getRun(5));        // нет такого метода в интерфейсе

        FieldMouse f = new FieldMouse();
        System.out.println(f.getSpeed(5)); // 11.0
        System.out.println(f.getRun(5));   // 20.0
    }
}