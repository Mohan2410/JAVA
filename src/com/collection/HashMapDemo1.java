package com.collection;

import java.util.*;

public class HashMapDemo1 {
    public static void main(String[] args){
        HashMap m = new HashMap();
        m.put("chiranjivi",700);
        m.put("raju",800);
        m.put("om",200);
        m.put("nagarjun",500);

        System.out.println(m); //{nagarjun=500, chiranjivi=700, om=200, raju=800}
        System.out.println(m.put("chiranjivi",1000));
        System.out.println(m);  // {nagarjun=500, chiranjivi=1000, om=200, raju=800}  and return old value

        Set s = m.keySet();
        System.out.println(s); // [nagarjun, chiranjivi, om, raju]

        Collection c = m.values();
        System.out.println(c);  //[500, 1000, 200, 800]

        Set s1 = m.entrySet();
        System.out.println(s1);

        Iterator itr = s1.iterator();
        while (itr.hasNext()){
            Map.Entry m1 =  (Map.Entry)itr.next();
            System.out.println(m1.getKey()+"........."+m1.getValue());
            if(m1.getKey().equals("nagarjuna")){
                m1.setValue(100000);
            }
        }                                   /*
                                                nagarjun.........500
                                                chiranjivi.........1000
                                                om.........200
                                                raju.........800
                                             */
        System.out.println(m);
    }
}
