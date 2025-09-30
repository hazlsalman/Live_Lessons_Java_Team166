package day03_stringManipulations;

import java.util.Locale;

public class C01_NonPrimitiveDataTurleri {

    public static void main(String[] args) {


        int sayi=10;

        String str="Java Candir";

        System.out.println(str.toUpperCase()); //JAVA CANDIR

        System.out.println(str.toLowerCase()); //java candir

        System.out.println(str); //Java Candir

        // kalici olarak buyuk harfe cevirelim

        str=str.toUpperCase();
        System.out.println("Atama yapıildiktan sonra str: "+ str);
        // Atama yapıildiktan sonra str: JAVA CANDİR

        System.out.println(str.toLowerCase()); // java candir

        //Eger buyuk/kucuk harf donusumlerinde ingilizceden farkli bir donusum varsa
        // ingilizce de i==>I  Turkcede i==>İ ı==>I

        // Bu tur local dil farkliliklari icin ozel bir method var

        // JAVA CANDIR'i turkce karakterlere uygun olarak java candır seklinde kucuk harfe cevirin

        System.out.println(str.toLowerCase(Locale.CHINESE)); // java candir

        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr"))); // java candır

        str=str.toLowerCase(Locale.forLanguageTag("Tr")); // java candır


    }
}
