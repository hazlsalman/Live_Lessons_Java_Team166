package day06_passByValue_mutable_immutable;

public class C04_DegerReturnEdenMethodlar {

    public static void main(String[] args) {

        int sayi=11;

        System.out.println("Main method icinde sayi: "+sayi); // 11

        System.out.println("Method call: "+method1(sayi)); // 21

        System.out.println("Method call'dan sonra sayi: "+sayi); // 11


    }


    public static int method1(int sayi){
       sayi = sayi+10;
        System.out.println("Method icinde sayi degeri: "+sayi ); // 21

        return sayi;

    }
}
