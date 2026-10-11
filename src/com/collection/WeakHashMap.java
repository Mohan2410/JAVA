package com.collection;

import java.util.HashMap;

public class WeakHashMap {
    public static void main(String[] args) throws InterruptedException {
        HashMap m = new HashMap();
        Temp t = new Temp();
        m.put(t,"durga");
        System.out.println(m);
        t=null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(m);

    }
}
