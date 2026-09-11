class Demo1 {
    static void isVowelIf(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("The Charecter is Vowel");
        }
        else{
            System.out.println("The character is Consonent");
        }
    }
}
class TestCharacter{
    public static void main(String[] args){
        Demo1.isVowelIf('o');

    }
}

