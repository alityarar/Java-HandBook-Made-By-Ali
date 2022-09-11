package day05;

public class C01_PreIncrementPostIncrement {
    public static void main(String[] args) {
        int sayi=10;
        //artirmak istersek
        sayi++;
        System.out.println(sayi);

        System.out.println("pre-incrementten once" + sayi);

        System.out.println("pre-increment satirinda" + ++sayi);  //sayiyi arttirip oyle gosterecek. Cunku arttirma islemi bastadir

        System.out.println("pre-incrementten sonra" + sayi);

        System.out.println("post-increment satirinda" + sayi++);  //once eski sayiyi gosterecek,daha sonra 1 ekleyecek ve sonraki printte gosterecek

        System.out.println("post-increment satirindan sonra" + sayi);


        int sayi1 = 10;
        int sayi2=20;
        int sayi3=30;

        sayi2=sayi1++;
        System.out.println(sayi1 + "," + sayi2+ ","+ sayi3 );

        int ornek1=15;
        int ornek2=25;
        int ornek3=30;

        ornek1=ornek3++;
        ornek2=ornek1++;
        System.out.println(ornek1 + "," + ornek2+ ","+ ornek3 );
        //ornek1=30//31
        //ornek2=31
        //ornek3=31

    }
}
