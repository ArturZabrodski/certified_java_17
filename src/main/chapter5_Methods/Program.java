package main.chapter5_Methods;

public class Program {
    public static void main(String[] unused) {
        var p1 = new Penguin();
        p1.name = "Lilly";
        p1.nameOfTallestPenguin = "Lilly 1";
        var p2 = new Penguin();
        p2.name = "Willy";
        p2.nameOfTallestPenguin = "Willy 1";

        System.out.println(p1.name);
        System.out.println(p1.nameOfTallestPenguin);
        System.out.println(p2.name);
        System.out.println(p2.nameOfTallestPenguin);
        System.out.println(Penguin.nameOfTallestPenguin);


        Koala.main(new String[0]); // call static method
        System.out.println();


        Snake s = new Snake();
        System.out.println(s.hiss); // s is a Snake
        s = null;
        System.out.println(s.hiss); // s is still a Snake
        Snake.hiss = 4;
        Snake snake1 = new Snake();
        Snake snake2 = new Snake();
        snake1.hiss = 6;
        snake2.hiss = 5;
        System.out.println(Snake.hiss);



    }
}
