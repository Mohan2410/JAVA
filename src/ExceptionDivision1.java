public class ExceptionDivision1{
    public static void main(String[] args){
        try{
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = a/b;
            System.out.println("Result is: "+c);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Please enter two integers, as below");
            System.out.println("Java division 10 2");
        }catch (NumberFormatException e){
            System.out.println("Please enter only integers");
        }catch(ArithmeticException e){
            System.out.println("please do not enter zero as a second value");
        }
        finally{
            System.out.println("always executed");
        }
    }
}