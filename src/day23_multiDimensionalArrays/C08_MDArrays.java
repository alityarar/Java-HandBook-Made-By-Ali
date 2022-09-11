package day23_multiDimensionalArrays;

public class C08_MDArrays {
    public static void main(String[] args) {
        //Assagidaki multi dimansional arrayin
        //ic arraylerindeki son elemanlarin carpimini ekrana yazdiran
        //bir kod yazin  { {1,2,3} , {4,5} , {6}}

        int arr[][]={{1,2,3} , {4,5} , {6}};
        int carpim=1;

        for (int i = 0; i <arr.length ; i++) {
            carpim*=arr[i][arr[i].length-1]; //neden arr[i].length-1 yapmadik?


        }
        System.out.println(carpim);
    }
}
