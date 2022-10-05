package main.chapter8._2_Coding_Functional_Interfaces._3_;

/**
 * следующая реализация Dive представляет собой функциональный интерфейс:
 */

@FunctionalInterface
public interface Dive {
    String toString();               // является общедоступным методам, определенным в классе Object
    public boolean equals(Object o); // является общедоступным методам, определенным в классе Object
    public abstract int hashCode();  // является общедоступным методам, определенным в классе Object
    public void dive();
}