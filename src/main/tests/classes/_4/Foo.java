package main.tests.classes._4;

public class Foo {
    protected Number getValue(Number number) {
        return number;
    }
}


class Bar extends Foo {

//    @Override
//    public Integer getValue(Integer number) {  // метод подходит только для перегрузки, а не переопределения
//        return number;
//    }

    @Override
    public Integer getValue(Number number) {  // Override, рабочий вариант
        return 0;
    }

//    @Override
//    public int getValue(Number number) {     // похож на метод выше, нужен тип Integer
//        return 0;
//    }

//    @Override
//    public Object getValue(Number number) {  // нельзя вернуть тип Object в данном случае
//        return number;
//    }

//    @Override
//    public String getValue(Number number) {  // нельзя вернуть тип String в данном случае
//        return String.valueOf(number);
//    }

    public static void main(String[] args) {
        Number number = 2;

        Foo foo1 = new Foo();

        System.out.println(foo1.getValue(2));  // 2

        Foo foo2 = new Bar();

        System.out.println(foo2.getValue(2));  // 0
    }
}
