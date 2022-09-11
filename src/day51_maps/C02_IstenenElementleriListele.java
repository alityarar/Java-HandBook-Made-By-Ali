package day51_maps;

import day49_maps.MapOlustur;

import java.util.*;

public class C02_IstenenElementleriListele {

    public static void main(String[] args) {

        Map<Integer,String> sinifMap= MapOlustur.mymap();

        String istenenDil="QA";

        List<String> istenenDiliBilenler= istenenDiliBilenListesiOlustur(sinifMap,istenenDil);

        System.out.println(istenenDiliBilenler);
     }

    public static List<String> istenenDiliBilenListesiOlustur(Map<Integer, String> sinifMap, String istenenDil) {

        List<String>istenenDiliBilenler = new ArrayList<>();

        Collection<String> sinifValueCollection= sinifMap.values();

        List<String> sinifValueList = new ArrayList<>();
        sinifValueList.addAll(sinifValueCollection);
        int outerArrayBoyut= sinifValueList.size();
        String ilkValue=sinifValueList.get(0);
        String ilkValueArray[]=ilkValue.split(", ");
        int innerArrayBoyut=ilkValueArray.length;

        String valueMDArr[][]=new String[outerArrayBoyut][innerArrayBoyut];

        for (int i = 0; i <outerArrayBoyut ; i++) {

            String temp[] = sinifValueList.get(i).split(", ");

            for (int j = 0; j <innerArrayBoyut ; j++) {
                valueMDArr[i][j]=temp[j];


            }


        }


        for (int i = 0; i <outerArrayBoyut ; i++) {

                if (valueMDArr[i][2].equals(istenenDil)){
                    istenenDiliBilenler.add(valueMDArr[i][0]);
                }

            }


        return istenenDiliBilenler;
    }
}
