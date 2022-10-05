package main.chapter8._4_Working_with_Built_in_Functional_Interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Implementing Supplier
 */

@FunctionalInterface
public interface Supplier<T> {
    T get();
}

class Main1 {
    public static void main(String[] args) {
        Supplier<LocalDate> s1 = LocalDate::now;
        Supplier<LocalDate> s2 = () -> LocalDate.now();
        LocalDate d1 = s1.get();
        LocalDate d2 = s2.get();
        System.out.println(d1); // 2022-02-20
        System.out.println(d2); // 2022-02-20

        Supplier<StringBuilder> s11 = StringBuilder::new;
        Supplier<StringBuilder> s21 = () -> new StringBuilder();
        System.out.println(s11.get()); // Empty string
        System.out.println(s21.get()); // Empty string

        Supplier<ArrayList<String>> s3 = ArrayList::new;
        ArrayList<String> a1 = s3.get();
        System.out.println(a1);         // []
        System.out.println(s3);     // main.chapter8._4_Working_with_Built_in_Functional_Interfaces.Main$$Lambda$20/0x0000000800c02660@f6f4d33
    }
}