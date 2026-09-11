class Demo2 {
    static void isVowelSwitch(char ch){
        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':

                System.out.println(ch + " is vowel");
                break;

            default:
                System.out.println(ch +" is Consonent");
        }
    }
}
public class TestCharacter1{
    public static void main(String[] args){
        Demo2.isVowelSwitch('z');
    }
}