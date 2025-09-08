package UNIT_3;

import java.util.ArrayDeque;
import java.util.Deque;

public class deque1 {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("First");
        deque.addFirst("zero");
        deque.addLast("Second");
        System.out.println(deque.getLast());
        System.out.println(deque.getFirst());
        System.out.println(deque);
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());





    }
}
