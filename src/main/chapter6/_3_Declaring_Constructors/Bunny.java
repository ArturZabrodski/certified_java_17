package main.chapter6._3_Declaring_Constructors;

public class Bunny {

    public Bunny() {
    }
    public Bunny(int x) {
        System.out.print("hop");
    }

//    public Bunny(var food) { // DOES NOT COMPILE, не может включать var
//    }

//    public bunny() {}        // DOES NOT COMPILE

    public void Bunny() {
    }  // method

    public static void main(String[] args) {
        Bunny b = new Bunny(); // при создании объекта без аргументов, при наличии
                               // других конструкторов, нужно объявлять дефолтный конструктор
    }
}