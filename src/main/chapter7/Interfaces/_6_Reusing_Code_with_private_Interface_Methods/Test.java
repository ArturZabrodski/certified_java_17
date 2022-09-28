package main.chapter7.Interfaces._6_Reusing_Code_with_private_Interface_Methods;

public class Test implements Schedule{
    public static void main(String[] args) {
        Test s = new Test();
        Schedule.workOut();
        s.wakeUp();


    }
}
