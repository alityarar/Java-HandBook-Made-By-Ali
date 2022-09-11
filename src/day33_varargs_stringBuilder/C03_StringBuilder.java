package day33_varargs_stringBuilder;

public class C03_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder("Java cok guzel");
        StringBuilder sb3=new StringBuilder(10);

        System.out.println(sb1.length()); //0
        System.out.println(sb1.capacity());  //16

        System.out.println(sb2.length()); //14
        System.out.println(sb2.capacity());  //30

        System.out.println(sb3.length()); //0
        System.out.println(sb3.capacity());  //10

        //append methodu ile sb'a ekleme yapabiliriz

        sb1.append("Java").append(" ").append("cok").append("guzel");
        System.out.println("sb1 length ; "+sb1.length());  //13
        System.out.println("sb1 capacity ; "+sb1.capacity());  //16

        sb1.append(3);
        System.out.println(sb1); //Java cokguzel3
        sb1.append(true);
        System.out.println(sb1); //Java cokguzel3true

        System.out.println("sb1 length ;  ");


    }
}
