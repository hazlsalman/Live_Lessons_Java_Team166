package day05_arrayOlusturmaVeKullanma;

public class C05_ArraydekiTumElemanlariKullanma {

    public static void main(String[] args) {

        int [] sayilar={4,6,2,6,8,1,2,5,8,0,1,3,5,6,8,};

        // sayilar arrayindeki tum elemanlarin toplamini asagidaki gibi yazdirin
        // outpu: array'deki....sayilar toplami=.....

        // Bir array'deki tum elementleri elden gecirmeniz gerekiyorsa for loop kullanilir
        int toplam=0;
        for (int i = 0; i <sayilar.length ; i++) {
           toplam += sayilar[i];

        }
        System.out.println("Array'deki "+ sayilar.length+ " sayinin toplami = "+toplam );
        // Array'deki 15 sayinin toplami = 65


        // array'de kac tane tek sayi bulundugunu yazdirin
        int sayac=0;
        for (int i = 0; i <sayilar.length ; i++) {
            if (sayilar[i]%2!=0){
                sayac++;
            }
        }
        System.out.println("array'deki tek sayilarin sayisi: "+sayac);
        // array'deki tek sayilarin sayisi: 5

        // sayilar array'indeki en buyuk sayiyi yazdirin

        int enBuyukSayi= sayilar[0];
        for (int i = 0; i <sayilar.length ; i++) {
            if (sayilar[i]>enBuyukSayi){
                enBuyukSayi=sayilar[i];
            }
        }
        System.out.println("Array'deki en buyuk sayi: "+enBuyukSayi);
        //Array'deki en buyuk sayi: 8

        // array'deki cift sayilarin toplami

        int ciftSayilarToplami=0;
        for (int i = 0; i <sayilar.length ; i++) {
            if (sayilar[i]%2==0){
                ciftSayilarToplami +=sayilar[i];
            }
        }
        System.out.println("Array'deki cift sayilarin toplami: "+ciftSayilarToplami);
        //Array'deki cift sayilarin toplami: 50


        //array'deki en kucuk sayiyi yazdirin

        int enKucukSayi=sayilar[0];

        for (int i = 0; i <sayilar.length ; i++) {
            if (sayilar[i]<enKucukSayi){
                enKucukSayi=sayilar[i];
            }
        }
        System.out.println("Array'deki en kucuk sayi: "+enKucukSayi);
        // Array'deki en kucuk sayi: 0



    }
}
