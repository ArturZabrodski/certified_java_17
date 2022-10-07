package main.chapter8_Lambdas_and_Functional_Interfaces._4_Working_with_Built_in_Functional_Interfaces._1_;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate dateOfBirth;
    private Double grade; // почасовая оплата

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }
}
