package main.chapter8_Lambdas_and_Functional_Interfaces._2_Coding_Functional_Interfaces._3_;

/**
 * не является функциональным классом, т.к. содержат 2 метода
 */

//@FunctionalInterface
public interface Hibernate {
    String toString();

    public boolean equals(Hibernate o); // 1, не является общедоступным методам, определенным в классе Object

    public abstract int hashCode();

    public void rest();                 // 2
}