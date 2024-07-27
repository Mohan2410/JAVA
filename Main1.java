class testClass{
    public static String name;
    public int age;
    public String skinColor;

    // constructor
    public testClass(int age,String skinColor){
        this.age = age;
        this.skinColor = skinColor;
    }

    public static void printSomething(){
        System.out.println("Printing...");
    }

    // getter setter method

    public static String getName(){
        return name;
    }

    public static void setName(String name){
        testClass.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getSkinColor(){
        return skinColor;
    }

    public void setSkinColor(String skinColor){
        this.skinColor = skinColor;
    }
}

public class Main1
{
    public static void main(String[] args) {
        testClass.name = "MOHAN";
        
        testClass tc = new testClass(20, "gray");
        System.out.println("Name: "+testClass.getName());

        testClass tc1 = new testClass(22, "white");
        System.out.println(tc1.name);
    
        testClass.printSomething();
    }
}