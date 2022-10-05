package main.chapter6._other;

class Foo4{
    static String name = "Foo";

     void print(){
        System.out.println(this.name);
    }
}

public class Bar4 extends Foo4{
    String name = "Bar";

//     static void printName(){     // выдает ошибку
     void printName(){
        super.print();
    }

    public static void main(String[] args) {
//        new Bar4.printName();  // c new не работает
        Bar4 bar4 = new Bar4();
        bar4.printName();        // Foo
    }
}
