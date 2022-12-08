package main.tests.arrays;

import java.util.Arrays;

public class Program7 {
    public static void main(String[] args) {
        // Расходы за неделю
        double mondayExpense = 100.50;
        double tuesdayExpense = 500.00;
        double wednesdayExpense = 10.00;
        double thursdayExpense = 0.0;
        double fridayExpense = 40.60;
        double saturdayExpense = 500.10;
        double sundayExpense = 200.00;

        Double[] expenses = {mondayExpense, tuesdayExpense, wednesdayExpense, thursdayExpense, fridayExpense, saturdayExpense, sundayExpense};

        System.out.println(Arrays.toString(expenses));
    }
}
