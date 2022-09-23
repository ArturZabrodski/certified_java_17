package main.chapter6._4_Initializing_Objects.Initializing_final_Fields;

/**
 * к моменту завершения работы конструктора всем переменным final должно быть присвоено значение ровно один раз.
 * если значение не присвоено, будет ошибка.
 */

public class MouseHouse {
    private final int volume;
    private final String name;

    public MouseHouse() {
        this.name = "Empty House"; // Constructor assignment
    }

    {
        volume = 10; // Instance initializer assignment
    }
}

//
//public class MouseHouse {
//    private final int volume;
//    private final String type;
//    {
//        this.volume = 10;
//    }
//    public MouseHouse(String type) {
//        this.type = type;
//    }
//    public MouseHouse() { // DOES NOT COMPILE
//        this.volume = 2; // DOES NOT COMPILE
//    }
//}