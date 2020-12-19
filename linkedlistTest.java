package ankit;


import java.util.*;

public class linkedlistTest {
    public static void main(String[] args) {

        LinkedList<Integer> ll = new LinkedList<Integer>();

        // add operations

        int num = 1;

        for (int i = 0; i < 15; i++) {
            ll.add(num + i + 10);
            num++;
        }

        System.out.println(ll);
        LinkedList<Integer> all = new LinkedList<Integer>();

        // add operations
        all.add(5);
        all.add(10);
        all.add(20);

        // add all operations
        ll.addAll(3, all);

        System.out.println(all);

        System.out.println(ll);

        // add node at first position
        ll.addFirst(100);
        ll.offerFirst(150);

        System.out.println(ll);

        // add at last position
        ll.addLast(200);
        ll.offerLast(250);

        System.out.println(ll);

        // add at specific position
        ll.add(5, 60);

        System.out.println(ll);

        // remove at position
        ll.removeFirst();
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
        ll.remove(3);
        System.out.println(ll);

        System.out.println(ll.peekFirst());

        System.out.println(ll.peekLast());
    }

}