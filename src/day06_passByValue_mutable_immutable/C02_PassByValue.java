package day06_passByValue_mutable_immutable;

public class C02_PassByValue {

    public static void main(String[] args) {


        int sayi=20;

        // Java da ayni method icinde , ayni isimde iki variable olusturulamaz

        // int = 40;

        // String sayi="2";

        System.out.println("Main method'da sayi variable'inin degeri: "+sayi); // 20

        method1(sayi);

        System.out.println("Main method'da method call'dan sonra sayi variable'inin degeri: "+sayi);

        method2(sayi);

        System.out.println("Main method'da method2 call'dan sonra sayi variable'inin degeri: "+sayi);


    }

    public static void method1(int sayi){

        sayi = 4* sayi;

        System.out.println("Method'da sayi variable'nin degeri: "+ sayi);

    }

    public static void method2(int a){

        a=4*a;

        System.out.println("Method'da a variable'inin degeri:"+a);
    }

}
