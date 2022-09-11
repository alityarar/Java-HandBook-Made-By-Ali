public class DenemeBilmemKac {
    public static void main(String[] args) {
        //hello gibi seylerde yan yana ayni harfleri sildircez

        String str="hello";

        for (int i = 0; i <str.length() ; i++) {
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                System.out.print(str.charAt(i));

            }else{
                System.out.print("*");
            }

        }
    }
}
