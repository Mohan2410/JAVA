package com.collection;

import java.util.*;

public class CollExample1 {
    public static void main(String[] args) {

//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//
//        System.out.println(list); //10,20,30,40
//
//        list.remove(0);
//        list.remove(0);
////        list.remove(2);
//
//        System.out.println(list);  //30,40
//
//        List<Integer> list2 = new ArrayList<>();
//        list2.add(101);
//        list2.add(102);
//        System.out.println("list2: "+list2);   //101,102
//
//        list2.addAll(list);
//        System.out.println("list: "+list2);  //30,40,101,102
//
//        list.removeAll(list2);
//        System.out.println(list);
//        System.out.println(list.size());
//
//        list.add(11);
//        list.add(22);
//        list.add(33);
//        list.add(44);
//
//        System.out.println(list);
//        System.out.println(list.size());
//
//        System.out.println("list2: "+list2);
//        list2.clear();
//        System.out.println("list2: "+list2);
//
//        System.out.println("list: "+list);
//
//        Iterator<Integer> iterator = list.iterator();
//        while(iterator.hasNext()){
//            System.out.println("Element: "+iterator.next());
//        }
//
//
//        List<Integer> list3 = new ArrayList<>();
//        list3.add(111);
//        list3.add(222);
//        list3.add(333);
//        list3.add(444);
//        list3.add(555);
//        System.out.println(list3.get(0));
//        System.out.println(list3.get(1));
//        System.out.println("before set: "+list3);
//
//        list3.set(0,777 );
//        System.out.println("after set: "+list3);
//
//        list3.toArray();
//
//        Object[] arr = list3.toArray();
//        for(Object val: arr){
//            System.out.println(val);
//        }
//
//        System.out.println("list3: "+list3);
//        System.out.println(list3.contains(147));
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        System.out.println(list);

        list.remove(0);
        list.remove(1);
        list.remove(2);

        System.out.println("after removing: "+list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(11);
        list2.addAll(list);
        System.out.println(list2);

        System.out.println("list2: "+list2);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(90);
        list3.add(12);
        list3.add(27);
        list3.add(11);
        list3.add(80);
        list3.add(70);
        System.out.println("List3: "+list3);
//        list3.clear();
        System.out.println("list3: "+list3);

        ArrayList<String> strlist = new ArrayList<>();
        strlist.add("Mohan");
        strlist.add("Sunil");
        strlist.add("Ram");
        strlist.add("Sham");
        strlist.add("Om");
        strlist.add("Kapil");

        System.out.println("Element: "+strlist);

        Iterator<String> lst = strlist.iterator();
        while(lst.hasNext()){
            System.out.println("Element: "+lst.next());
        }


        System.out.println(strlist.get(0));
        System.out.println(strlist.get(1));
        System.out.println(strlist.get(2));


        ArrayList<Integer> collist = new ArrayList<Integer>();
        collist.add(10);
        collist.add(20);
        collist.add(2);
        collist.add(11);
        collist.add(4);

        Collections.sort(collist);

        System.out.println(collist);

        System.out.println("previous list: "+list);

        ArrayList<Integer> newlist = (ArrayList<Integer>) list.clone();
        System.out.println("newlist: "+newlist);

        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(90);
//        System.out(marks.ensureCapacity(90));

        System.out.println("marks: "+marks);
        marks.add(12);
        marks.add(13);
        marks.add(14);
        marks.add(15);
        marks.add(16);

        System.out.println("marks: "+marks);
        System.out.println(marks.isEmpty());

        System.out.println(marks.indexOf(14));

//        Linked List

        List<Integer> l1 = new LinkedList<>();
        l1.add(99);
        l1.add(88);
        l1.add(77);
        l1.add(66);
        l1.add(88);
        l1.add(55);
        l1.add(88);
        l1.add(44);
        l1.add(88);
        l1.add(44);

        System.out.println("l1: "+l1);
        System.out.println(l1.lastIndexOf(88));

        System.out.println("list: "+list);
        System.out.println("l1: "+l1);

        LinkedList<Integer> list5 = new LinkedList<>();
        list5.add(91);
        System.out.println(list5);
        list5.addFirst(1);
        System.out.println(list5);
        list5.addLast(101);
        System.out.println(list5);

//        list5.removeFirst();
//        System.out.println(list5);
//
//        list5.removeLast();
//        System.out.println(list5);

        System.out.println(list5.getFirst());
        System.out.println(list5.getLast());

//        peek,poll,offer
        System.out.println(list5.peek()); //peak means starting of linked list

//        System.out.println(list5.poll());//poll method is used to return one element and then remove element
//        System.out.println(list5);
//
//        System.out.println(list5.poll());
//        System.out.println(list5);

        System.out.println(list5);

        System.out.println(list5.offer(845));           //offer() method is nothing but just add the element at the end like addLast() method
        System.out.println(list5);



//        JAVA STACK
//            push,pop,empty,peak

        Stack<Integer> st = new Stack<>();
        st.push(10);
        System.out.println(st);
        st.push(20);
        System.out.println(st);
        st.push(30);
        System.out.println(st);
        st.push(40);
        System.out.println(st);

        st.pop();
        System.out.println(st);

        System.out.println(st.peek());
//        System.out.println(st.search());

        System.out.println(st);
        System.out.println(st.search(70));
    }

}
