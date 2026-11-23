package com.collection_practice_program;

import java.util.Comparator;

public class Employee implements Comparable {
    String ename;
    int eid;

    public Employee(String ename,int eid){
        this.ename = ename;
        this.eid = eid;
    }

    @Override
    public String toString(){
        return ename+" "+eid;
    }

    public int compareTo(Object obj){
        int eid1 = this.eid;
        Employee e = (Employee) obj;
        int eid2 = e.eid;
        if(eid1 < eid2){
            return -1;
        }else if(eid1 > eid2){
            return +1;
        }else {
            return 0;
        }
    }
}
