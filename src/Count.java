//create a NSB of and count how many object you created

class Example20{
    private static int count;

//    NSB is created
    {
        count++;
    }
    Example20(){
        System.out.println("\n object is created using NPC");
    }

    Example20(int x){
        System.out.println("\nobject is created using the IPC");
    }
    Example20(String s){
        System.out.println("\nobject is created using the SPC");
    }
    Example20(double d){
        System.out.println("\n object is created using the DPC");
    }
    public static int getCount(){
        return count;
    }
}
public class Count{
    public static void main(String[] args){
        System.out.println("Number of object created: "+Example20.getCount());

        System.out.println();

        Example20 e1 = new Example20();
        Example20 e2 = new Example20(100);
        Example20 e3 = new Example20("RAM");
        Example20 ee4 = new Example20(99.12);

        System.out.println();


        System.out.println("Number of object created: "+Example20.getCount());

    }
}