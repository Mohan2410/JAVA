public class Sample{
    public static void main(String[] args) {
        String msg = greet(" Mohan");
        System.out.println(msg);
    }

    static String greet(String naam)
    {
        String msg = "hello"+naam;
        return msg;
    }
}