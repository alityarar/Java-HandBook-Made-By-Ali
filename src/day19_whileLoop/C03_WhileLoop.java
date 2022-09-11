package day19_whileLoop;

public class C03_WhileLoop {
    public static void main(String[] args) {
        //while loop ile 5 den kucuk sayilari yazdiralim
        int sayi = 1;
        int sayac=1;
        while (sayi<5){
            System.out.print(sayi);
            sayac++;
            sayi++;
        }
        System.out.println(sayac);
    //ayni soruyu do-while loop ile yapalim
        sayi=1;
        do {
            System.out.println(sayi);
            sayi++;
        }while (sayi<3);

    }

}
