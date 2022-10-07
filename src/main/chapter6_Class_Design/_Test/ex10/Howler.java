package main.chapter6_Class_Design._Test.ex10;

/**
 * Which of the following pages, when inserted into the blanks, allow the code to compile?
 * (Choose all that apply.)
 * Какая из следующих пар, будучи вставленной в пробелы, позволяет коду компилироваться?
 * (Выберите все, что применимо.)
 *
 * +++ A. this(3) at line 3, this("") at line 14
 * B. this() at line 3, super(1) at line 14
 * +++ C. this((short)1) at line 3, this(null) at line 14
 * D. super() at line 3, super() at line 14
 * E. this(2L) at line 3, super((short)2) at line 14
 * F. this(5) at line 3, super(null) at line 14
 * G. Remove lines 3 and 14.
 *
 */

public class Howler {
    public Howler(long shadow) {
        // line 3
    }

    private Howler(int moon) {
        super();
    }
}

class Wolf extends Howler {
    protected Wolf(String stars) {
        super(2L);
    }

//    public Wolf() {
//        // line 14
//    }
}