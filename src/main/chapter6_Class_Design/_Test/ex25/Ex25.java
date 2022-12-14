package main.chapter6_Class_Design._Test.ex25;

/**
 * Which of the following are true about a concrete class? (Choose all that apply.)
 * Что из нижеперечисленного верно в отношении конкретного класса? (Выберите все, что применимо.)
 *
 * A. A concrete class can be declared as abstract.
 * +++B. A concrete class must implement all inherited abstract methods.
 * +++C. A concrete class can be marked as final.
 * D. A concrete class must be immutable.
 * E. A concrete method that implements an abstract method must match the method declaration
 * of the abstract method exactly.
 *
 * A. Конкретный класс может быть объявлен как абстрактный.
 * +++B. Конкретный класс должен реализовывать все унаследованные абстрактные методы.
 * +++C. Конкретный класс может быть помечен как окончательный.
 * D. Конкретный класс должен быть неизменяемым.
 * E. Конкретный метод, реализующий абстрактный метод, должен точно
 * соответствовать объявлению метода абстрактного метода.
 *
 * Конкретные классы по определению не являются абстрактными, поэтому вариант A неверен.
 * Конкретный класс должен реализовывать все унаследованные абстрактные методы,
 * поэтому вариант B является правильным. Конкретные классы могут быть дополнительно
 * помечены как окончательные, поэтому вариант C является правильным. Вариант D неверен; конкретные
 * классы не обязательно должны быть неизменяемыми. Конкретному подклассу нужно только
 * переопределить унаследованный абстрактный метод, а не точно соответствовать объявлению.
 * Например, можно использовать ковариантный возвращаемый тип. По этой причине вариант E неверен.
 */

public class Ex25 {
}
