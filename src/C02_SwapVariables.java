public class C02_SwapVariables {
    public static void main(String[] args) {
        int sayi1=10;
        int sayi2=20;
        System.out.println("Swapdan once sayi1: " + sayi1 + ",sayi2 : " +sayi2);

        //1.adim bos bir variable olusturup sayi 1 i one atayacagiz

        int temp=sayi1;

        //2. adım sayı1 e yenı deger atıyalım
        sayi1=sayi2;

        //3. adim sayi2 ye temp e yedekledigimiz sayi 1 degerini atayalim

        sayi2= temp;

        System.out.println("Swapdan sonra sayi1: " + sayi1 + ",sayi2 : " +sayi2);
    }
}
