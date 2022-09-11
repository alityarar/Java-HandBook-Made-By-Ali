package day06_concatenation_Operators;

public class ConditionalOperatorsDenemeler {
    public static void main(String[] args) {

        boolean num1=(185*51==841)&&(184*51==460); //False
        boolean num2=(185*51!=841)&&(184*51==460); //False
        boolean num3=(185*51!=841)&&(184*51!=460); //True
        boolean num4=(185*51==841)||(184*51==460); //False
        boolean num5=(185*51!=841)||(184*51==460); //True
        boolean num6=(185*51!=841)||(184*51!=460); //True


        int numb1=20;
        //System.out.println(10<numb1>20); //Hatali Yazim
        System.out.println(10<numb1 && numb1>20); //En dogru yazim
        System.out.println(numb1<30 && numb1>50); //Tam olarak dogru cikmaz
        System.out.println(numb1<30 || numb1>50); //O yuzden iki sayi arasinda degilse
                                                  //  || kullanmak daha dogrudur

    }
}
