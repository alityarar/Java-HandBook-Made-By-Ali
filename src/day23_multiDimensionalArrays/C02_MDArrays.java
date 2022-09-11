package day23_multiDimensionalArrays;

public class C02_MDArrays {
    public static void main(String[] args) {
        int arr[][]={{3,1,7},{6,10,3}};
        //verilen multi dimansional arrayin tum elementlerinin toplamini bulunuz

        int toplam=0;


        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                toplam+=arr[i][j];

            }

        }
        System.out.println(toplam);

    }
}
