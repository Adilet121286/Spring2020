package day52_Collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class Q {
    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<>();// first IN first OUT

            queue.add("A");
            queue.add("B");
            queue.add("C");
            queue.add("D");

        System.out.println(queue);

        String str = queue.poll();

        System.out.println(str);



    }
}
