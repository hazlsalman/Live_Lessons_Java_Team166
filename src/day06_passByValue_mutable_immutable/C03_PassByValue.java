package day06_passByValue_mutable_immutable;

public class C03_PassByValue {


    public static void main(String[] args) {

        String isim="Ali Can";

        System.out.println("Main method'da isim: "+isim);

        buyukYazdir(isim);

        System.out.println("Main method'da method call'dan sonra isim: "+isim);



    }

    public static void buyukYazdir(String name){
        System.out.println("Method'da name: " + name.toUpperCase());

       // System.out.println(isim); // bu mahallede isim variable'i yok

        // Java method call yapildiginda isim variable'inin kendisini yollamaz
        // degerini yollar

        // 12. satirda method call yapilirken isim variable'i
        // buyukYazdir method'una yollandi
        // AMMAAA Java method'lar arasi
        // variable yollanirken variable'in kendisini degil(reference)
        // variable'in degerini (value) yollar.
        // cunku Java Pass By Value ozelligini kabul etmistir.
    }





}
