package main.chapter6._6_Creating_Abstract_Classes._Introducing_Abstract_Classes;

//public class FennecFox extends Canine {
//    public int getSound() {  // должен быть String
//        return 10;
//    }
//}

//class ArcticFox extends Canine { // должен имлементить методы
//}

class Direwolf extends Canine {
    //    public abstract rest();  // не может иметь абстрактные методы в обычном классе
    public String getSound() {
        return "Roof!";
    }
}

class Jackal extends Canine {
//    public abstract String name;   // не может иметь абстрактные методы в обычном классе

    public String getSound() {
        return "Laugh";
    }
}
