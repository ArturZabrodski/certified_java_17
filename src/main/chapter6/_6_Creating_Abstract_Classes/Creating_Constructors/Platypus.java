package main.chapter6._6_Creating_Abstract_Classes.Creating_Constructors;

/**
 * Основное различие между конструктором в абстрактном классе и неабстрактным классом
 * заключается в том, что конструктор в абстрактном классе может быть вызван только тогда,
 * когда он инициализируется неабстрактным подклассом. Это имеет смысл, поскольку
 * абстрактные классы не могут быть созданы.
 */

public class Platypus extends Mammal {
    String chew() {
        return "yummy!";
    }

    public static void main(String[] args) {
        new Platypus();  // yummy!
    }
}