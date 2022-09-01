package main.test0_1;

import java.util.logging.Logger;

// Add any necessary import statements here
public class TestClass {
    public static void main(String[] args) {
        // compiled
        var name = new Zoo("Java Zoo").getName();
        var имя = new Zoo("Zoo").getName();
        System.out.println(name);
        System.out.println(имя);

        // not compiled (final)
        final Logger myLogger = Logger.getAnonymousLogger();
//        myLogger = Logger.getLogger(String.class.getName());

        // compiled
        var $num = (Integer) null;

        // not compiled (f)
//        float value = 102.0;


//        Object o = new Turtle();
//        Mammal m = new Monkey();
//        Animal a = new Rabbit();
//        o = m;



    }
}
