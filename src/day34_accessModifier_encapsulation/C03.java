package day34_accessModifier_encapsulation;

public class C03 {
    //encapsule edecegimiz 2 variable olsun

    private int sayi;
    private String str;

    @Override
    public String toString() {
        return "C03 " +
                "sayi=" + sayi +
                ", str=" + str;
    }

    public int getSayi() {
        return sayi;
    }


    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
