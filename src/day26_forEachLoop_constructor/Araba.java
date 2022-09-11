package day26_forEachLoop_constructor;

public class Araba {
    /* java da her class olusturdugumuzda
    Java o classdan ileride objeler uretmek gerekebilecegini bilir
    ve biz ozellikle belirtmesek de java
    her olusturdugu classa bir constructor koyar

    Javanin class olustururken classa koydugu contructor a default constructor
    denir ve bu constructor gorunmez

    Eger biz gorunur bir constructorimiz olsun istersek
    default constructor ile ayni gorevi yapan bir constructor olusturabiliriz
    veya istersek ayni kaliptan farkli desenlerde objeler olusturmak icin
    farkli ozelliklerde constructorlar da olusturabiliriz

    constructor lari birbirinden farklilastiran tek ayricalik
    kullanilan parametre sayisi ve parametre data turudur
     */

    public Araba(){
        System.out.println("parametresiz const calisti");


    }

    /* Bir kod bloguun method veya const olmasindan emin olmak istiyorsaniz
    iki seye dikkat etmelisiniz

    1-const larin ismi class ismi ile ayni olmak zorundadir, yani buyuk harfle
    baslar

    2-Constructor larin retur type i olmaz

    ozetle;const larin adi classadi ile ayni olmali ve
    retur type i olmamali

     */

    public Araba (String renk){
        System.out.println(renk + " renkli bir araba uretildi");
    }

    public Araba (int yil){
        System.out.println(yil + " model bir araba uretildi");
    }

    public Araba(int yil, String renk){
        System.out.println(yil + " model ve "+renk+" renk bir arabaa uretildi");
    }

}
