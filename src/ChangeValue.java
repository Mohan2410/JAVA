import java.util.Arrays;

public class ChangeValue{
     public static void main(String[] args) {
          int arr[] = {10,20,30,40,50,60,70};
          change(arr);
          System.out.println(Arrays.toString(arr));
     }

     static void change(int[] nums)
     {
          nums[0] = 99;
     }
}