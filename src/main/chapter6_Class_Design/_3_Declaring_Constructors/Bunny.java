package main.chapter6_Class_Design._3_Declaring_Constructors;

// дефолтный конструктор - это конструктор который вставляет компилятор
// если мы переопределяем дефолтный конструктор - он будет уже
// не дефолтный, а user-defined contructor

public class Bunny {

    public Bunny() {
        System.out.println("user-defined constructor - Bunny");
    }
    private Bunny(int x) {
        System.out.print("user-defined constructor with arguments - Bunny");
    }

//    public Bunny(var food) { // DOES NOT COMPILE, не может включать var
//    }

//    public bunny() {}        // DOES NOT COMPILE

    public void Bunny() {
    }  // method

    public static void main(String[] args) {
        Bunny b1 = new Bunny();     // при создании объекта без аргументов, при наличии
                                    // других конструкторов, нужно объявлять конструктор

        Bunny b2 = new Bunny(5); // private конструктор будет видим в этом классе
    }
}