package day03_stringManipulations;

public class C05_Substring_tekParametre {
    public static void main(String[] args) {

        String str = "Java cok guzel";

        System.out.println(str.substring(3)); // a cok guzel

        System.out.println(str.substring(7)); // k guzel

        System.out.println(str.substring(0)); // Java cok guzel

        System.out.println(str.length()); //14

        // sondan 3. karaktri yazdirin

        System.out.println(str.charAt(str.length()-3));
        System.out.println(str.charAt(11)); // z

        // sondan 3 karakteri yazdirin

        System.out.println(str.substring(str.length()-3));
        System.out.println(str.substring(11)); //zel


       // System.out.println(str.charAt(14)); //.StringIndexOutOfBoundsException
        // NOT: charAt() lenght veya daha buyuk sayiyi
        // index olarak kullanmak istedigimizde
        //StringIndexOutOfBoundsException verir


        System.out.println(str.substring(str.length()));

        // CharAt ile substring arasindaki en onemli fark
        // index olarak lenght yani karakter sayisi veya daha buyuk bir sayi girilirse
        // charAt() exception firlatir
        // substring methodu ise lenght degeri icin "hiclik" sonucunu dondurur

        str="Ali";

        // System.out.println(str.charAt(3));//.StringIndexOutOfBoundsException

        System.out.println(str.substring(3)); // hiclik (bos bir satir) yazdirir

        // lenght() degerinden buyuk sayilar icin ikisi de exception verir









    }
}
