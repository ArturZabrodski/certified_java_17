package main.tests.type_operators_blocks;

public class Program5 {
    final String name;      // обязательно должен быть конструктор с параметрами или блок инициализации переменной
                            // при одновременном отсутствии конструктора и блока инициализации будет ошибка
//    public Program5(String name) {
//        this.name = name;
//    }

    {
        name = "John";
    }

//    void setName(){       // переменной final не может быть присвоено новое значение
//        name = "John";
//    }

    public static void main(String[] args) {

    }
}
