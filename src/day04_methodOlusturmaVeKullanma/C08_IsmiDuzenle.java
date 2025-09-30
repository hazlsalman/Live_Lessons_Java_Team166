package day04_methodOlusturmaVeKullanma;

public class C08_IsmiDuzenle {
    public static void main(String[] args) {

        //   Verilen isim ve soyismi alip
        //   Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
        //   isim bosluk soyisim seklinde yazdiran bir method olusturun
        //   input : isim : Ali  soyisim :YILMAZ.     output : Ali Yilmaz


       ismiDuzenleYazdir("ali","yilmaz");
       ismiDuzenleYazdir("HASAN","KUCUK");
    }

    public static void ismiDuzenleYazdir(String isim,String soyIsim){

        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
        soyIsim=soyIsim.substring(0,1).toUpperCase()+ soyIsim.substring(1).toLowerCase();

        System.out.println(isim+" "+soyIsim);

    }
}
