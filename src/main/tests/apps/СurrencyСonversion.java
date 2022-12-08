package main.tests.apps;

public class СurrencyСonversion {
    public static void main(String[] args) {
        float usdToRub = 113.78f;
        float eurToRub = 125.31f;

        int amount = 75;

        float eurToUsd = eurToRub / usdToRub;
        float result = amount * eurToUsd;

        String format = "Курс Евро к Доллару: %.2f.\n%d Евро это %.2f Долларов.";

        System.out.println(String.format(format, eurToUsd, amount, result));
    }
}
