package main.tests.classes._3;

/**
 * 1 - проходим все static-переменные
 * 2 - проходим все static-иниторы
 * 3 - проходим все instance-переменные
 * 4 - проходим все instance-иниторы
 * 5 - запускаем все конструкторы, всключая перегрузку через this
 * 6 - instance-иниторы срабатывают для каждого создания объекта
 */

public class Program1 {
    static int number = 1;      // п.1

    public Program1() {         // п.4
        number = 4;
    }

    {                           // п.3
        number = 3;
    }

    static {                    // п.2
        number = 2;
    }

}

class Program2 extends Program1 {
    static int number = 8;      // п.3

    public Program2() {         // п.8
        number = 7;
    }

    {                           // п.7
        number = 5;
    }

    static {                    // п.4
        number = 6;
    }


    public static void main(String[] args) {
        System.out.println(number);            // 6, создание классов, проходим static-переменные, static-иниторы по двум классам

        Program1 p1 = new Program1();          // создание объекта Program1, проходим instance-переменные, instance-иниторы, конструкторы
        System.out.println(Program1.number);   // 4, смотрим по классу Program1, по конструктору Program1
        System.out.println(Program2.number);   // 6, смотрим по классу Program2, но только static-переменные, static-иниторы, конструктор не отрабатывался


        System.out.println("_____________");


        System.out.println(number);            // 6, создание классов, проходим static-переменные, static-иниторы по двум классам

        Program1 p12 = new Program2();         // создание объекта, проходим instance-переменные, instance-иниторы, конструкторы
        System.out.println(Program1.number);   // 4, смотрим по классу Program1, по конструктору Program1
        System.out.println(Program2.number);   // 7, смотрим по классу Program2, по конструктору Program2


        System.out.println("_____________");


        System.out.println(number);            // 7, т.к. создавался объект Program2, и последним отработал его конструктор

        Program2 p2 = new Program2();          // создание объекта, проходим instance-переменные, instance-иниторы, конструкторы
        System.out.println(Program1.number);   // 4, смотрим по классу Program1, по конструктору Program1
        System.out.println(Program2.number);   // 7, смотрим по классу Program2, по конструктору Program2
    }
}

