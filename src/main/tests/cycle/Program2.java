package main.tests.cycle;

public class Program2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            // В тренировке должно выполниться 5 кругов
            System.out.println("Круг " + i);
            // Выполнение каждого круга зависит от условия - проверьте, является ли круг чётным
            if (i % 2 == 0) {
                for (int j = 1; j <= 5; j++) {
                    // Если да, то присесть 5 раз
                    System.out.println("  Приседаем " + j);
                }
            } else {
                for (int j = 1; j <= 3; j++) {
                    // Иначе нужно отжаться 3 раза
                    System.out.println("  Отжимаемся " + j);
                }
            }
            for (int j = 1; j <= 7; j++) {
                // Независимо от номера круга качаем пресс 7 раз
                System.out.println("  Качаем пресс " + j);
            }
            // Небольшое подбадривание в конце каждого круга
            System.out.println("Хороший темп, так держать!");
        }
        System.out.println("Отлично позанимались сегодня! Вы - молодец!");
    }
}
