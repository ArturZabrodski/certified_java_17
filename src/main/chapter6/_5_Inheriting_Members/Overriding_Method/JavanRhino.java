package main.chapter6._5_Inheriting_Members.Overriding_Method;

public class JavanRhino extends Rhino {
    public String getName() {
        return "javan rhino";
    }

//    public CharSequence getColor() { // DOES NOT COMPILE,  CharSequence не является подтипом String.
//        return "grey";
//    }
}

