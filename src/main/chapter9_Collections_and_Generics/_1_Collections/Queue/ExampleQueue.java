package main.chapter9_Collections_and_Generics._1_Collections.Queue;

import java.util.*;

/**
 * Queue: Очередь - это коллекция, которая упорядочивает свои элементы в
 * определенном порядке для обработки.
 * <p>
 * FIFO (первый вход - первый выход).
 * LIFO (последний вошёл - первый вышел).
 * <p>
 * Deque - это подинтерфейс очереди, который обеспечивает доступ с обоих концов.
 * <p>
 * Основное преимущество LinkedList заключается в том, что он реализует как интерфейсы List, так и Deque
 */

public class ExampleQueue {
    public static void main(String[] args) {
        /**
         * Queue
         */
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(15);
        queue.add(4);
        System.out.println(queue);              // [10, 15, 4]
        System.out.println(queue.remove());     // 10 - удаляет первый элемент в очереди
        System.out.println(queue.peek());       // 15 - выводит первый элемент в очереди
        System.out.println(queue.remove(4)); // true, удаляем элемент 4
        System.out.println(queue.poll());       // 15 - возвращает и удаляет первый и единственный элемент в очереди
        System.out.println(queue.peek());       // null

        System.out.println();

        /**
         * Deque
         */
        Deque<Integer> deque = new LinkedList<>();
        System.out.println(deque.offerFirst(10)); // true, [10]
        deque.offerLast(4);                       // true, [10, 4]
        System.out.println(deque);                   // [10, 4]
        System.out.println(deque.peekFirst());       // 10, [10, 4]
        System.out.println(deque.pollFirst());       // 10 и удаляет этот элемент, [4]
        System.out.println(deque.pollLast());        // 4 и удаляет этот элемент, null
        System.out.println(deque.pollFirst());       // null
        System.out.println(deque.peekFirst());       // null

        System.out.println();

        /**
         * Stack
         */
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);         // [10]
        stack.push(4);          // [4, 10]
        System.out.println(stack); // [4, 10]
        System.out.println(stack.peek()); // 4, [4, 10]
        System.out.println(stack.poll()); // 4, [10]
        System.out.println(stack.poll()); // 10, null
        System.out.println(stack.peek()); // null

        System.out.println();


        /**
         * Stack является подклассом класса Vector
         */
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(10);         // [10]
        stack1.push(4);          // [10, 4]
        System.out.println(stack1);   // [10, 4]
        System.out.println(stack1.peek()); // 4, [4, 10]
        System.out.println(stack1.pop());  // 4, [10] аналогично методу poll()
        System.out.println(stack1.pop());  // 10, null
//      System.out.println(stack1.peek()); // exception
    }
}
