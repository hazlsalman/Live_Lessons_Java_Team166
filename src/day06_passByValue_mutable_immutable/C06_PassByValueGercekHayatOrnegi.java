package day06_passByValue_mutable_immutable;

public class C06_PassByValueGercekHayatOrnegi {

    public static void main(String[] args) {

        // verilen fiyat uzerinden %10 ve %20 indirim yapip
        // indirimli fiyati yazdiran iki method olusturun

        int urunfiyati=500;

        yuzde10Indirim(urunfiyati);
        yuzde20Indirim(urunfiyati);
        yuzde20Indirim(urunfiyati);
        yuzde10Indirim(urunfiyati);


    }

    public static void yuzde10Indirim(double urunfiyati){

        urunfiyati = urunfiyati*90/100;

        System.out.println("%10 indirimli fiyat: "+urunfiyati);

    }

    public static void yuzde20Indirim(double urunfiyati){

        urunfiyati = urunfiyati*80/100;

        System.out.println("%20 indirimli fiyat: "+urunfiyati);

    }
}
