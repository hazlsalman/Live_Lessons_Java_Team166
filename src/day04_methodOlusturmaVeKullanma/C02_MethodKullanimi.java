package day04_methodOlusturmaVeKullanma;

public class C02_MethodKullanimi {
    public static void main(String[] args) {


        String str="Java Candir";

       str.toUpperCase();
        // toUpperCase methodu gorevini yapti ve str'i buyuk harfe cevirdi
        // AMMA yazdirmadigi icin konsolda gorunmuyor
        // atama yapilmadigi icin str'da degismedi

        System.out.println(str.toLowerCase());

        // toLowerCase() görevini yapar
        // yazdirildigi icin konsolda gorunur
        // atama yapilmadigi icin str degismedi

        str=str.substring(0,4);

        // substring() gorevini yapti
        // yazdirilmadigi icin method'un dondurdugu sonuc konsolda gorulmedi
        // AMMA kaydedildigi icin str artik degisti

        System.out.println(str); // Java

    }
}
