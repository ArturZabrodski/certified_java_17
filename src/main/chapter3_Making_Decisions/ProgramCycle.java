package main.chapter3_Making_Decisions;

public class ProgramCycle {
    public static void main(String[] args) {

// for and foreach

        String[] names = new String[]{"aaa", "bbb", "ccc"};

        for (int counter = 0; counter < names.length; counter++)
            System.out.println(names[counter]);

        for (var name : names)
            System.out.println(name);

// foreach, list

//        public void printNames(List<String> names) {
//            for(var name : names)
//                System.out.println(name);
//        }

        int x1 = 0;
//        for(long y = 0, int z = 4; x < 5; x++) // DOES NOT COMPILE
        for (long y = 0, z = 4; x1 < 5; x1++)    // COMPILE
            System.out.print(y + " ");


//        String birds = "Jay";
//        for(String bird : birds) // DOES NOT COMPILE
//            System.out.print(bird + " ");


        String[] sloths = new String[3];
//        for(int sloth : sloths) // DOES NOT COMPILE
        for (String sloth : sloths) // COMPILE
            System.out.print(sloth + " ");

// While

        int hungryHippopotamus = 8;
        while (hungryHippopotamus > 0) {                // выполняется действие 1
            do {
                hungryHippopotamus -= 2;                // выполняется действие 2, 4
            } while (hungryHippopotamus > 5);
            hungryHippopotamus--;                       // выполняется действие 3
            System.out.print(hungryHippopotamus + ", ");// выполняется действие 5
        }

        //        int participants = 0;
//        int animals = 2;
//        while ((participants = participants + 1) < 10) {
//            System.out.println("hi");
//        }
//        System.out.println(participants);
//        do {
//        } while (animals++ <= 1);


        //        double iguana = 0;
//         do {
//             int snake = 1;
//             System.out.print(snake++ + " ");
//             iguana--;
//             } while (snake <= 5); // snake объявлен в do while
//         System.out.println(iguana);


// Adding Optional Labels

        int[][] myComplexArray = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 7, 12, 7}};

        OUTER_LOOP:
        for (int[] mySimpleArray : myComplexArray) {
            INNER_LOOP:
            for (int i = 0; i < mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i] + "\t");
            }
            System.out.println();
        }


        int frog = 15;
        BAD_IDEA:
        if (frog > 10)
            EVEN_WORSE_IDEA:{
                frog++;
            }

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


    }
}
