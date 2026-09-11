class Student1{
    static int count = 0;

    static String schoolName = "SVM";

    public Student1(){
        count++;

    }

    public static void getCount(){
        System.out.println("Total student: "+count);
    }
}