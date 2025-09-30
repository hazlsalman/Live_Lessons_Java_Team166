package day03_stringManipulations;

public class C02_CharAt_Lenght {


    public static void main(String[] args) {
        String str="Java Guzeldir.";

        //str'in ilk harfini yazdirin

        System.out.println(str.charAt(0)); // Java'da index hep 0'dan baslar J

        // Sadece ilk karakter degil, tum karakterlere charAt() ile ulasilabilir

        // str'in 7. karakteri yazdirin "u"

        System.out.println(str.charAt(6)); // u


        // str'in 40.karakterini yazdirin

        //System.out.println(str.charAt(39)); // StringIndexOutOfBoundsException
                                            // verilen index sinirlarin disinda

        // Java Guzeldir. metninde sondan 3. karakteri yazdirin // i
        System.out.println(str.charAt(11)); // i

        str="Java";
        // sonden ucuncu karakter icin yukaridaki kodu yazsak
       // System.out.println(str.charAt(11)); //i bunu tekrar kullanamayiz. Nasil dinamiklesebilir?

        // Dinamik olarak sondaki veya sondan ucuncu gibi sondan karakter saymamiz istenirse
        // lenght kullanilabilir

        // str'in 4 karakterli oldugu biliniyorsa
        // sondan 3. karakteri nedir?

        System.out.println(str.charAt(1)); // a


        str= "Yaprak Sinem Yılmaz Demir";

        // sondan 2. karakteri yazdirin

        System.out.println(str.charAt(23)); //i


        // lenght () methodu String bir ifadedeki karakter sayisini verir

        System.out.println(str.length()); //25

        // 25 karakter olduguna gore son karakterin indexi 24
        System.out.println(str.charAt(24)); // r

        // sondan ikinci karakter

        System.out.println(str.charAt(25-2)); // i

        System.out.println(str.charAt(str.length()-2)); // dinamik bir koda ulasilir
        //59. satirdaki kod str ne olursa olsun hep sondan 2.karakteri verir

        str="Java";

        System.out.println(str.charAt(str.length()-2)); //v

        str="Bugun hava cok guzel";

        System.out.println(str.charAt(str.length()-2)); //e

    }
}
