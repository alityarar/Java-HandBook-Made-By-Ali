package day14_stringManipulation;

public class C01_trim {
    public static void main(String[] args) {

        String str="   Siz ne derseniz deyin, Java bildigini okur.   ";

        str.trim();   //Bosluklari da gosterir
        System.out.println(str);
        System.out.println(str.length()); //49


        str=str.trim(); //bastaki ve sondaki bosluklari gostermez
        System.out.println(str);
        System.out.println(str.length()); //43



    }
}
