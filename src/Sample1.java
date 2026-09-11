public class Sample1{
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,60};

//        first way
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[4]);

//        second way

        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

//        third way
//        for each loop

        for(int value: arr){
            System.out.println(value);
        }
        System.out.println();


        for(int i=0; i<arr.length; i++){
            System.out.println("arr["+i+"]: "+ arr[i]);
        }
    }
}