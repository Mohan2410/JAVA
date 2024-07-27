public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
    }

    static void scope()
    {
        System.out.println();
    }
}


// Scope is basically we can't access the variable in another function 
// when a is declare in the main function the we can access only in the main function can't access in the scope or any other function