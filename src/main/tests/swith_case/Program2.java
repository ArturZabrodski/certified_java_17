package main.tests.swith_case;

/**
 * switch может рабоать только с примитивными типами данных
 * byte short char int
 */

public class Program2 {
   void switchNumber(double number){
       System.out.println(number);  // 1.0

//       switch (number) {                // здесь будет ошибка, т.к. передается тип double
//           case 1:
//               System.out.println("Integer");
//           case 1.0:                    // такого значения также не может быть, только если закастить
//               System.out.println("Float");
//       }
   }

    public static void main(String[] args) {
        Program2 test = new Program2();
        test.switchNumber(1);             // ошибки не будет

    }
}
