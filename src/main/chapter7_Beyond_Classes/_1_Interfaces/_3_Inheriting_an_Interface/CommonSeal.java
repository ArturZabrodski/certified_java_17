package main.chapter7_Beyond_Classes._1_Interfaces._3_Inheriting_an_Interface;

//public class CommonSeal extends HarborSeal {} // DOES NOT COMPILE, т.к. нужно имплементировать методы

public class CommonSeal extends HarborSeal {
    @Override
    public int getTailLength() {
        return 0;
    }
    @Override
    public int getNumberOfWhiskers() {
        return 0;
    }
}