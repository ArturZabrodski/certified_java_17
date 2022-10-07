package main.chapter7_Beyond_Classes._1_Interfaces._6_Reusing_Code_with_private_Interface_Methods;

public class Test implements Schedule{
    public static void main(String[] args) {
        Test s = new Test();
        Schedule.workOut();
        s.wakeUp();


    }
}
