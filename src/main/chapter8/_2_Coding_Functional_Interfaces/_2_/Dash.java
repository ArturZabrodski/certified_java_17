package main.chapter8._2_Coding_Functional_Interfaces._2_;

/**
 * Учитывая наш предыдущий функциональный интерфейс Sprint, какие из
 * следующих функциональных интерфейсов являются функциональными?
 */


public interface Dash extends Sprint {      // +
}                                           // расширяет интерфейс Sprint и наследует один метод sprint

//public interface Skip extends Sprint {      // -
//    void skip();
//}

//public interface Sleep {                    // -
//    private void snore() {
//    }
//
//    default int getZzz() {
//        return 1;
//    }
//}

//public interface Climb {                    // -
//    void reach();
//
//    default void fall() {
//    }
//
//    static int getBackUp() {
//        return 100;
//    }
//
//    private static boolean checkHeight() {
//        return true;
//    }
//}
