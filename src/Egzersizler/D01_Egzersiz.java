package Egzersizler;

public class D01_Egzersiz {
    public static void main(String[] args) {


        int sayi1=879;
        double sayi2=10;

        double sayi3= sayi1/sayi2; //87,9
        System.out.println(sayi3);

        int sayi4= (int) (sayi1/sayi2); // 87,9

        //deger double, variable int
        //yani variable daha dar dolayisiyila java bunu otomatik olarak yapmaz
        //soruumlulugu ustlenmemizi ister
        //sag tarafa yazdigimiz (int) sorumluluk bende demek
        //once bolumu yap sonra int e cevir demek

        System.out.println(sayi4);  //87

        int sayi5=140;
        byte sayi6=(byte) sayi5;  //sag taraftakideger in

        System.out.println(sayi6); //sonuc absurd cikti cunku
        // byte 128 ile sinirlidir, bu yuzden basa donerek tekrar eder

         int numA=2;
         numA = numA+3;

         // daha kolayi ====  numA+=3

        int numB=10;
        numB=numB*7;

        //daha kolayi ===== numB*=7



    }
}
