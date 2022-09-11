package day27_constructor;

public class Volvo {
    String marka="Volvo";
    String mensei="Isvec";
    String model;
    boolean elektrikliMi;
    int yil;
    String yakit;
    boolean otomatikPilot=otomatikPilotSorgusu();
    int maxHiz=maxHizAta();

    public Volvo(String mdl, boolean elk, int yl, String ykt) {
        model=mdl;
        elektrikliMi=elk;
        yil=yl;
        yakit=ykt;
    }
    public Volvo(){

    }

    private int maxHizAta() {
        int maxHiz=0;
        if (elektrikliMi){
            maxHiz=160;
        }else{
            maxHiz=240;
        }
        return maxHiz;
    }

    private boolean otomatikPilotSorgusu() {

        boolean sonuc=false;

        if (elektrikliMi){
            sonuc=true;
        }else{
            sonuc=false;
        }
        return sonuc;
    }
    public String toString() {
        String arabaOzellikleri="Model ;  " + model + " Yakit ; "+ yakit;



        return arabaOzellikleri;
    }
}
