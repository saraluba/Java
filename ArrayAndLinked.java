package Zad2004;

import java.util.ArrayList;
import java.util.LinkedList;

import static java.lang.System.*;

public class ArrayAndLinked {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        long t0 = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            al.add(0, i);
        }
        long timeArrayList = System.currentTimeMillis() - t0;
        System.out.println("Iteration add");
        System.out.printf("Array List: %d%n",timeArrayList);
        LinkedList<Integer> ll = new LinkedList<>();
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            ll.add(0,i);
        }
        long timeLinkedList = System.currentTimeMillis() - t1;
        System.out.printf("Linked List: %d%n",timeLinkedList);
        long t2 = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            al.get(i);
        }
        long timeArrayList2 = System.currentTimeMillis() - t2;
        out.println("Iteration get ");
        out.printf("Array List: %d%n",timeArrayList2);
        long t3 = System.currentTimeMillis();
        for(int i=0; i<100_000; i++){
            ll.get(i);
        }
        long timeLinkedList2 = System.currentTimeMillis() - t3;
        out.printf("Linked List: %d%n", timeLinkedList2);
    }
}

/*
Add: Using array list we add element on the beginning and then have to shift everything over,
     so it takes much more time than using linked list, where we don't shift elements, just
     changing the pointer of the previous and the next node.

Get: Using array list we can go directly to the index, using linked list we have to iterate
     the elements.
 */
