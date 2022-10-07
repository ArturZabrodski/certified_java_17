package main.chapter8_Lambdas_and_Functional_Interfaces._4_Working_with_Built_in_Functional_Interfaces._2_;

import java.util.ArrayList;

public class Example1 {
    public static void main(String[] args) {
        ArrayList<Client> clients = new ArrayList<>();

        clients.add(new Client("Harry Carter", 15, true));
        clients.add(new Client("Adam Atkinson", 5, true));
        clients.add(new Client("Bobby Robertson", 8, true));
        clients.add(new Client("Liam Ellis", 6, false));
        clients.add(new Client("Alex Tomson", 9, true));
        clients.add(new Client("Ryan Ayala", 4, false));
        clients.add(new Client("Kale Molina", 3, true));
        clients.add(new Client("Otto Holman", 7, false));

//        for (Client client : clients) {
//            client.setSum(client.getSum() - 1);
//        }

        // аналогичная запись с помощью лямбды
        clients.forEach(client -> client.setSum(client.getSum() - 1));

        // вывод
        clients.forEach(client -> System.out.println(client.toString()));
    }
}
