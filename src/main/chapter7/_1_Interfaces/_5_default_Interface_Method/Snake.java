package main.chapter7._1_Interfaces._5_default_Interface_Method;

public class Snake implements IsColdBlooded {
    public boolean hasScales() { // Required override
        return true;
    }

    public double getTemperature() { // Optional override
        return 12;
    }

    public static void main(String[] args) {
        Snake s = new Snake();
        System.out.println(s.getTemperature()); // 12.0

        IsColdBlooded i = new Snake();
        System.out.println(i.getTemperature()); // 12.0
    }
}
