package com.collection;

import java.util.PriorityQueue;

public class PriorityQueqeDemo2 {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue(15, new PriorityQueueDemo2MyComparator());
        q.offer("A");
        q.offer("Z");
        q.offer("L");
        q.offer("B");
        System.out.println(q);
    }
}
