package day07_accessModifier_encapsulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_Mutable_Immutable_Class_Tekrar {


    public static void main(String[] args) {

        String metin="Java candir";

        metin.toUpperCase();
        // yazdirmadigimiz icin konsolda gormeyiz
        // AMMA 10.satirda java metni buyuk harfe cevirir

        System.out.println(metin);  // Java candir

        // String de atama yapılmıyorsa methodla yapılan degisiklikler kalici olmaz

        System.out.println("18.satirda metin: "+metin.toLowerCase()); // java candir

        System.out.println("20.satirda metin: "+metin); // Java candir

        metin=metin.substring(0,4);

        System.out.println("24.satirda metin: "+metin); // Java

        // String immutable bir class'dir.
        // Bu bilginin bize yansiyan en onemli sonucu
        // hazir methodlarla yapilan degisiklikler kalici olmaz
        // kalici degisiklik istenirse ATAMA yapilmalidir.

        // System.out.println(sayilar);

        /*
        Java runTime programdir yani siz calistirmaya basladiginizda
        HER SEY SIFIRDAN baslar calisma devam ettigi surece (consoldaki tus kirmizi oldugu sürece)
        yapilan degisiklik KALICI olur

        Java'nin calismasi durdugunda (consoldaki tus griye dondugunda)
        yapilan tum degisiklikler cope gider

        bir sonraki calismada HER SEY YİNE SIFIRDAN baslar
         */


        List<Integer> sayilar=new ArrayList<>(Arrays.asList(4,7,8,9,2,3));

        System.out.println("38.satirda sayilar:"+sayilar); // [4, 7, 8, 9, 2, 3]

        sayilar.remove(2); // 8'i siler

        sayilar.add(11);

        System.out.println("32.satirda sayilar:"+sayilar); // [4, 7, 9, 2, 3, 11]

        // ArrayList mutable'dir yani degistirilebilirdir.
        // bu bilginin bize yansiyan en buyuk sonucu bir listede
        // hazir methodla yapilan degisiklik kalici olur
        // ATAMA yapma mecburiyeti yoktur

        String str="Java gercekten cok guzeldir";

        /*
          str bir variabledir
          String str variable'i icin data turudur.

          String genel olarak bakildiginda bir class'dir.


         */

        Integer sayi=10;


    }
}
