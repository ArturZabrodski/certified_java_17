package main.chapter7._1_Interfaces._5_default_Interface_Method;

public interface IsColdBlooded {
    boolean hasScales();

    default double getTemperature() {
        return 10.0;
    }
}
