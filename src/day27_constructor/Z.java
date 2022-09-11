package day27_constructor;

public class Z {
    String isim;
    String soyisim;
    int numara;
    boolean gercekMi;


    public Z(String ism, String soysm, int no, boolean grc) {
        isim=ism;
        soyisim=soysm;
        numara=no;
        gercekMi=grc;

    }

    public Z(String isim, String soyisim, int numara) {
        this.isim=isim;
        this.soyisim=soyisim;
        this.numara=numara;
    }

    public String toString() {

        return ("Isim ; "+isim + " Soyisim ; "+soyisim+"Numara ; "+ numara);
    }
}
