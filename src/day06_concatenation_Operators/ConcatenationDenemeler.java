package day06_concatenation_Operators;

public class ConcatenationDenemeler {
    public static void main(String[] args) {
        String str1="World";
        String str2="New";
        int num1=2;
        int num2=10;

        //New World 2020

        System.out.println(str2+" "+str1+" "+(num1*num2)+(num1*num2));

        //World New 102

        System.out.println(str1+" "+str2+ " "+num2+num1);

        String word1="Base";
        String word2="Ground";
        int numb1=1;
        int numb2=2;

        // Base 1 Ground 2

        System.out.println(word1+" "+numb1+" "+word2+" "+numb2);

        //Base 10 World 20

        System.out.println(word1+" "+ num2+" "+str1+" "+(num1*num2));
    }
}
