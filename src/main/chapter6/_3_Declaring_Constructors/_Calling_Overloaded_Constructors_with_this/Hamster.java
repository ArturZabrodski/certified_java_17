package main.chapter6._3_Declaring_Constructors._Calling_Overloaded_Constructors_with_this;

public class Hamster {
    private String color;
    private int weight;

    public Hamster(int weight, String color) { // First constructor
        this.weight = weight;
        this.color = color;
    }

//    public Hamster(int weight) {            // Second constructor
//        this.weight = weight;
//        color = "brown";
//    }

//    public Hamster(int weight) {            // Second constructor
//        Hamster(weight, "brown");           // DOES NOT COMPILE
//    }


    public Hamster(int weight) {              // Second constructor
//        new Hamster(weight, "brown");       // 1) Compiles, но оъбект после создания отбрасывается
        this(5, "brown");         // 2) Compiles, объект будет создан
    }

    /**
     * В любом конструкторе может быть только один вызов this().
     * Вызов this() должен быть первым оператором в конструкторе
     */

//    public Hamster(int weight) {
//        System.out.println("chew");
//        // Set weight and default color
//        this(weight, "brown");              // DOES NOT COMPILE
//    }

    public static void main(String[] args) {
        var h = new Hamster(20, "grey");

        System.out.println(h.weight);
        System.out.println(h.color);

        var h1 = new Hamster(10);

        System.out.println(h1.weight);   // 1) 0       2) 5
        System.out.println(h1.color);    // 1) null    2) brown
    }
}
