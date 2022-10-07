package main.chapter3_Making_Decisions;

public class ProgramIfElseCase {
    public static void main(String[] args) {

        int penguin = 50, turtle = 75;
        boolean older = penguin >= turtle;
        System.out.println(older);
        if (older = true) System.out.println("Success"); // compile
        else System.out.println("Failure");
//        else if (penguin != 50) System.out.println("Other");


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

