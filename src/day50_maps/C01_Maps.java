package day50_maps;

import day49_maps.MapOlustur;

import java.util.*;

public class C01_Maps {
    public static void main(String[] args) {
        /*
        Siniftaki ogrenci listesini duzenli olarak yazdiralim
         */
        Map<Integer,String> siniflist =MapOlustur.mymap();
        System.out.println(siniflist);

        /*
        Eger keylere tek tek ulasmak istersek index yapisina
        ihtiyacimiz var ancak map index yapisini desteklemez
        bunun icin keyleri once bir sete sonra da set in tum
        elementlerini bir liste ekledik
         */

        Set<Integer> sinifKeySeti=siniflist.keySet();
        List<Integer> keyList=new ArrayList<>();

        keyList.addAll(sinifKeySeti);

        System.out.println(keyList.get(1));

        //Simdi de valueleri index ile ulasabilecegimiz bir sekle sokalim

        Collection<String> sinifValueCollection= siniflist.values();
        System.out.println(sinifValueCollection);

        List<String> sinifValueList = new ArrayList<>();
        sinifValueList.addAll(sinifValueCollection);
        System.out.println(sinifValueList);

        //her bir value birden fazla bilgiyi iceriyor
        //onun icin value leri multidimensional bir arrey e atmak
        //mantikli duruyor ancak MDA olusturmak icin boyutlari bilmeliyiz

        int outerArrayBoyut= sinifValueList.size();
        System.out.println(outerArrayBoyut);

        //inner arraylerin boyutunu bulmak biraz daha kompleks olacak

        String ilkValue=sinifValueList.get(0);
        System.out.println(ilkValue);
        String ilkValueArray[]=ilkValue.split(", ");
        int innerArrayBoyut=ilkValueArray.length;

        String valueMDArr[][]=new String[outerArrayBoyut][innerArrayBoyut];

        for (int i = 0; i <outerArrayBoyut ; i++) {

            String temp[] = sinifValueList.get(i).split(", ");

            for (int j = 0; j <innerArrayBoyut ; j++) {
                valueMDArr[i][j]=temp[j];


            }

        }
        System.out.println(Arrays.deepToString(valueMDArr));

        System.out.println("Numara  Isim  Soyisim   Brans");
        System.out.println("=============================");

        for (int i = 0; i <keyList.size() ; i++) {
            System.out.print(keyList.get(i)+"    ");
            for (int j = 0; j <innerArrayBoyut ; j++) {
                System.out.print(valueMDArr[i][j]+"     ");
                
            }
            System.out.println(" ");

        }
    }
}
