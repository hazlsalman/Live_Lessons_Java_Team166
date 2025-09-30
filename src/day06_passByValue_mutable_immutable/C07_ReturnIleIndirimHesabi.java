package day06_passByValue_mutable_immutable;

public class C07_ReturnIleIndirimHesabi {

    public static void main(String[] args) {

        // verilen fiyat uzerinden %10 ve %20 indirim yapip
        // indirimli fiyati donduren iki method olusturun
        double urunFiyati=500;

        System.out.println(yuzde10Indirim(urunFiyati));
        System.out.println(yuzde20Indirim(urunFiyati));
        System.out.println(yuzde20Indirim(urunFiyati));



    }


    public static double yuzde10Indirim(double urunfiyati){

        urunfiyati = urunfiyati*90/100;
        return urunfiyati;

    }

    public static double yuzde20Indirim(double urunfiyati){

        urunfiyati = urunfiyati*80/100;
        return urunfiyati;

    }



}
