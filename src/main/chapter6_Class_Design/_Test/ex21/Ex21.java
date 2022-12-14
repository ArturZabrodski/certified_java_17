package main.chapter6_Class_Design._Test.ex21;

/**
 * Which of the following are properties of immutable classes? (Choose all that apply.)
 * Какие из следующих свойств относятся к неизменяемым классам? (Выберите все, что применимо.)
 *
 * A. The class can contain setter methods, provided they are marked final.
 * +++B. The class must not be able to be extended outside the class declaration.
 * C. The class may not contain any instance variables.
 * D. The class must be marked static.
 * E. The class may not contain any static variables.
 * F. The class may only contain private constructors.
 * +++G. The data for mutable instance variables may be read, provided they cannot be modified
 * by the caller.
 *
 * A. Класс может содержать методы-установщики при условии, что они помечены как окончательные.
 * +++B. Класс не должен иметь возможности быть расширен за пределы объявления класса.
 * C. Класс может не содержать никаких переменных экземпляра.
 * D. Класс должен быть помечен как статический.
 * E. Класс может не содержать никаких статических переменных.
 * F. Класс может содержать только частные конструкторы.
 * +++G. Данные для изменяемых переменных экземпляра могут быть прочитаны при условии, что они
 * не могут быть изменены вызывающей стороной.
 *
 * Неизменяемые объекты не включают методы установки, что делает вариант A неправильным.
 * Неизменяемый класс должен быть помечен как окончательный или содержать только частные конструкторы, поэтому ни
 * один подкласс не может расширить его и сделать изменяемым, что делает вариант B правильным. Параметры C и E
 * неверны, так как неизменяемые классы могут содержать как экземплярные, так и статические переменные. Вариант D
 * неверен, так как пометка класса static не является свойством неизменяемых объектов. Вариант F
 * неверен. Хотя неизменяемый класс может содержать только частные конструкторы, это не
 * требование. Наконец, вариант G является правильным. Вызывающей стороне разрешается получать доступ к данным в изменяемых
 * элементах неизменяемого объекта при условии, что у них нет возможности изменять эти элементы.
 */

public class Ex21 {
}
