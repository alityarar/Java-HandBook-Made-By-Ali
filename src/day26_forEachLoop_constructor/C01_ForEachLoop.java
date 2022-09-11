package day26_forEachLoop_constructor;

public class C01_ForEachLoop {
    public static void main(String[] args) {

        int arr[]={2,4,6,8,11};

        //elementleri for loop ile yazdiralim

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]+" ");

        }
        System.out.println("");

        //bunu for-each loop ile yapacak olursak
        //for-each loop u calistirmak icin bir collection vermeliyiz

        for (int each :arr
             ) {
            System.out.println(each+" ");

        }
        //avantaji ; index,baslangic deferi ve bitis degeri gibi detaylarla
        //ugrastirmadan collections dan tum elementleri bize getirir


        //dezavantaji;  indexe bagli bir islem yapamayiz.
    }
}
