package day17_ForLoop;

public class C08_Palindrome {
    public static void main(String[] args) {
        String input="Madam";
        
        palindromeKontrolEt(input);
        
    }

    private static void palindromeKontrolEt(String input) {
        String terstenInput="";
        for (int i = input.length()-1; i >=0; i--) {
            terstenInput+=input.charAt(i);


        }
        System.out.println("girdiginiz kelimenin tersten yazilisi ; "+terstenInput);

        if (input.equalsIgnoreCase(terstenInput)){
            System.out.println("Girdiginiz kelime palindrome");
        }

    }
}
