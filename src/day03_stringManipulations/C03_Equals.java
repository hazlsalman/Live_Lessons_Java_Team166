package day03_stringManipulations;

public class C03_Equals {
    public static void main(String[] args) {

        String str="istanbul";

        str="Istanbul"; // = Java'da karsilastirma islemi yapmaz
                        // = isaretinin Java'daki anlami ATAMA'dir.

        // Java'da genel olarak Karsilastirma icin == kullanilir

        int sayi=10;
        System.out.println(sayi==10); // true
        System.out.println(sayi-1==10); //false

        // AMA String'de karsilastirma icin == kullanilmasi tercih edilmez
        // cunku karsilastirilan metinler ayni olsa da islem sonucu olarak
        // bazen true bazen false verebilir

        String s1="Ali";
        String s2="Ali";
        String s3= new String("Ali");
        String s4="A"+"li";

        String str1="A";
        String str2="li";
        String s5= str1+str2;


        System.out.println(s1==s2); //true
        System.out.println(s1==s3); //false
        System.out.println(s1==s4); //true
        System.out.println(s1==s5); //false
        System.out.println(s1=="Ali");//true

        // String'de metinlerin ayni oldugunu kontrol etmek icin
        // equals() methodu kullanilir

        System.out.println("====================");

        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s1.equals(s4)); // true
        System.out.println(s1.equals(s5)); // true
        System.out.println(s1.equals("Ali")); // true

        // Metinler ayni ise true karakter farkliligi varsa false verir

        System.out.println("=================");

        System.out.println(s1.equals("ali")); // false
        System.out.println(s1.equals("ALI")); //false
        System.out.println(s1.equals("Ali ")); // false


    }
}
