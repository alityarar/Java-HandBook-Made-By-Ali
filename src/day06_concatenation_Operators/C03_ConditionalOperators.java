package day06_concatenation_Operators;

public class C03_ConditionalOperators {
    public static void main(String[] args) {

        /* && AND isareti

        && isareti ile birlestirilen tum ifadeler dogru ise sonuc dogru olur.
        Diger tum durumlar false doner
        && isareti mukemmelliyetcidir

        Carpma islemine benzetilir, onlarca 1 in yaninda 0 konursa, cevap 0 olur


         */

        boolean ex1= (5+2==7)&&(4+3!=5);  //True
        System.out.println((5*2!=15)&&(5>7));  //False



        /* || OR isareti

        || isareti ile birlestirilen ifadeler yanlis ise sonuc false olur.
        Diger durumlarda True doner. (|| operatoru iyimserdir)
        Sadece 1 tane dogru olmasi True icin yeterlidir

         */

        boolean son1=(5+2==7) || (4+3!=5);   //True
        System.out.println((5*2==15)||(5>7)); //False



        int num1=15;

        /* num1'in 10 ile 20 araliginda oldugunu true diyerek dondurelim
        -Java uclu karsilastirma kabul etmez
        ornegin (10<b>15) kabul edilmez
        -Ikili karsilastirmalar yapip mantiksal operatorlerle birlestirmeliyizz
         */

        System.out.println(10<num1 && num1<20); //True

        int num2=5;

        /* num2'nin 10 ile 20 arasinda olmadigini true diyerek dondurelim

         */

        System.out.println(num2<10 || num2>20);

        /* ONEMLI

       Eger bir seyin arasindakini istiyorsak && kullanmak
       Eger bir seyin arasinda harici-Disindakileri istiyorsak || kullanmak mantiklidir

         */
    }
}
