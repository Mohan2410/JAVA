package com.collection;

import java.util.*;

public class CollPart2 {
    public static void main(String[] args){

//        Queue<Integer> q = new LinkedList<>();
//        q.add(10);
//        q.add(20);
//        q.add(30);
//        q.add(40);
//        q.add(50);
//
//        System.out.println(q);
//
//        System.out.println(q.poll());
//        System.out.println(q);
//
//        System.out.println(q.peek());


////        *****ArrayDeque
//
//
//        Deque<Integer> q = new ArrayDeque<>();
//        q.add(10);
//        q.add(20);
//        q.add(30);
//
//        System.out.println(q);
//
//        q.addFirst(5);
//        System.out.println(q);
//
//        Deque<Integer> q1 = new ArrayDeque<>();
//        q1.offer(30);
//        q1.offerLast(99);
//        q1.offerFirst(24);
//        q1.offerLast(100);
//
//        System.out.println(q1);
//
//        q1.pollFirst();
//        System.out.println(q1);
//        q1.pollFirst();
//        System.out.println(q1);
//
//        System.out.println(q1.size());
//
//        q1.offer(87);
//        q1.offer(97);
//
//        System.out.println(q1);
//
//        System.out.println(q1.peek());
//        System.out.println(q1.peekLast());
//        System.out.println(q1.peekFirst());

//        Priority Queqe: who have the highest will get the chnace first

        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(40);
        pq.offer(50);
//        pq.offer(23);
        pq.offer(60);
        pq.offer(70);

        System.out.println(pq);
        System.out.println(pq.poll());
    }
}
