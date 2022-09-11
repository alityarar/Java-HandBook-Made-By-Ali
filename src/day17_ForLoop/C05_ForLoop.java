package day17_ForLoop;

public class C05_ForLoop {
    public static void main(String[] args) {
        //Kullanicidan 100 den kucur bir tam sayi isteyin
        //1 den baslayarak girilen sayiya kadar 3 un kati olan sayilari yazdirin

        int sayi=55;
        for (int i = sayi; i >=1 ; i--) {
            if (i%3==0&&i%2==0){
                System.out.println(i+" ");
            }
        }


        //Verilen sayiyi sadece verilen seylere bolunebildigini gosteren kod
        /*int num=146453422;
        for (int i = num; i >=1; i--) {
            if (i%3==0&&i%2==0&&i%5==0&&i%7==0){
                System.out.println(i);
            }

        }*/

        char harf1 ='f';
        char harf2 = 'l';
        for (char i = harf1; i <=harf2 ; i++) {
            System.out.println(i + " ");

        }

        int baslangic=13;
        int bitis=76;
        int artis=3;
        for (int i = baslangic; i <=bitis; i+=artis) {
            System.out.println(i);

        }

        int basla=10;
        int son=150;
        int oran=4;
        for (int i = basla; i <=son; i+=4.3) {
            System.out.println(i+ "nci ayin sonucu");

        }


    }
}
