package day36_inheritance;

public class Child extends Parent {
    Child(){
        //super()
        System.out.println("Child conts calisti");
    }

    public static void main(String[] args) {
        Child child=new Child();
        //Once parent class calisir
        /*
        Tum constlarin ilk satirinda
        biz gormesek bile super() vardir

        Yani parent class in parametresiz
        const call i calisir

        Const icinde const varsa super()
        yok olur, ama icindeki const un ilk
        satirinda ortaya cikar

         */

    }
}
