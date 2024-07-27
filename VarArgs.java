import java.util.*;

public class VarArgs{
    public static void main(String[] args) {
        fun(2,3,4,5,6,7,8,9);//length of array are not set it is infinite or depends on how many arguments are provide to the array

        fun();//this will an empty array

        // multiple arguments 
        multipleargs(10, 044,"Mohan","Ralul","OM");
    }

    static void fun(int...v)
    {
        System.out.println(Arrays.toString(v));
    }

    // multiple arguments function 
    static void multipleargs(int a,int b,String...v)
    {

    }
}