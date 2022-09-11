package day04;

public class C02_AutoWidening {
    public static void main(String[] args) {

        byte sayi1= 44;
        System.out.println(sayi1);
        short sayi2 = sayi1;
        System.out.println(sayi2);


        //integer bolumlerinde eger tam bolunmuyorsa, sondaki kusurat silinir ve gorunmez

        //kucuk birim buyuk birime cevrilir ama buyuk birim kucuk birime cevrilmeyebilir

        //byte in sinirini gecemez, en dusuk noktadan donmeye devam eder


        int numA=2;
        numA=numA + 3;

        numA+=3;   // BU VE USTTEKI AYNI SEY
        System.out.println(numA);

        int numB=10;
        numB=numB*7;

        numB*=7;
        System.out.println(numB);


        int numC=10;
        numC*=4;

        int deneme1=15;
        deneme1+=10;

        int deneme2=20;
        deneme2-=5;

        System.out.println(deneme1);
        System.out.println(deneme2);


    }
}
