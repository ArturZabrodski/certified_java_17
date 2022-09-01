package main.test3;

import java.time.DayOfWeek;
import java.util.Map;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
//        int participants = 0;
//        int animals = 2;
//        while ((participants = participants + 1) < 10) {
//            System.out.println("hi");
//        }
//        System.out.println(participants);
//        do {
//        } while (animals++ <= 1);

        int penguin = 50, turtle = 75;
        boolean older = penguin >= turtle;
        System.out.println(older);
        if (older = true) System.out.println("Success"); // compile
        else System.out.println("Failure");
//        else if (penguin != 50) System.out.println("Other");


        int height = 1;
        L1:
        while (height++ < 10) {
            long humidity = 12;
            L2:
            do {
                if (humidity-- % 12 == 0) {
//                    System.out.println(Math.random());
                    break L2;
                }
                int temperature = 30;
                L3:
                for (; ; ) {
                    temperature++;
                    if (temperature > 50) {
//                        System.out.println(Math.random());
                        continue L2;
                    }
                }
            } while (humidity > 4);
        }

        byte amphibian = 1;
        String name = "Frog";
        String color = switch (amphibian) {
            case 1 -> {
                yield "Red";
            }
//             case 2 -> {if(name.equals("Frog")) yield "Green"; } // does not compile
            case 3 -> {
                yield "Purple";
            }
            default -> throw new RuntimeException();
        };
        System.out.print(color);


//        double iguana = 0;
//         do {
//             int snake = 1;
//             System.out.print(snake++ + " ");
//             iguana--;
//             } while (snake <= 5); // snake объявлен в do while
//         System.out.println(iguana);

    }

//    private DayOfWeek getWeekDay ( int day, final int thursday){
//        int otherDay = day;
//        int Sunday = 0;
//        switch (otherDay) {
//            default:
//            case 1:
//                continue;
//            case thursday:
//                return DayOfWeek.THURSDAY;
//            case 2, 10:
//                break;
//            case Sunday:
//                return DayOfWeek.SUNDAY;
//            case DayOfWeek.MONDAY:
//                return DayOfWeek.MONDAY;
//        }
//        return DayOfWeek.FRIDAY;
//    }

    void findZookeeper(int id) {
        System.out.print(switch (id) {
            case 10 -> "Jane";
            case 20 -> {
                yield "Lisa";
            }
            case 30 -> "Kelly";
            case 40 -> "Sarah";
            default -> "Unassigned";
        });
    }

}
