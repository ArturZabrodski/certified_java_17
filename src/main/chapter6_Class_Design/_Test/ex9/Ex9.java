package main.chapter6_Class_Design._Test.ex9;

/**
 * Which of the following statements about overridden methods are true? ((Choose all that apply.)
 * Какие из следующих утверждений о переопределенных методах верны? ((Выберите все, что применимо.)
 *
 * A. An overridden method must contain method parameters that are the same or covariant
 * with the method parameters in the inherited method.
 * +++ B. An overridden method may declare a new exception, provided it is not checked.
 * C. An overridden method must be more accessible than the method in the parent class.
 * D. An overridden method may declare a broader checked exception than the method in the
 * parent class.
 * +++ E. If an inherited method returns void, then the overridden version of the method must
 * return void.
 * F. None of the above
 *
 * A. Переопределенный метод должен содержать параметры метода, которые совпадают или ковариантны
 * с параметрами метода в унаследованном методе.
 * +++ B. Переопределенный метод может объявить новое исключение, при условии, что оно не проверено.
 * C. Переопределенный метод должен быть более доступным, чем метод в родительском классе.
 * D. Переопределенный метод может объявлять более широкое проверяемое исключение, чем метод в
 * родительском классе.
 * +++ E. Если унаследованный метод возвращает значение void, то переопределенная версия метода должна
 * возвращать значение void.
 * F. Ничего из вышеперечисленного
 *
 * Подпись должна точно совпадать, что делает вариант А неправильным.
 * Не существует такой вещи, как ковариантная подпись.
 * Переопределенный метод не должен объявлять никаких новых проверенных исключений
 * или проверяемого исключения, которое шире, чем унаследованный метод.
 * По этой причине вариант B является правильным, а вариант D - неправильным.
 * Параметр C неверен, поскольку переопределенный метод может иметь тот же модификатор доступа,
 * что и версия в родительском классе. Наконец, переопределенные методы
 * должны иметь ковариантные возвращаемые типы, и только void является ковариантным с void,
 * что делает option E правильно.
 */

public class Ex9 {
}
