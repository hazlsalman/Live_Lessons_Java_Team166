package day04_methodOlusturmaVeKullanma;

public class C04_AsalMi {

    public static void main(String[] args) {

        // Verilen bir tam sayinin
        // asal sayi olup olmadigini kontrol edip , sonucu yazdiran bir method olusturun
        asalMiYazdir(20);
        asalMiYazdir(13);

    }

    public static void asalMiYazdir(int girilenSayi ){

        for (int i = 2; i <girilenSayi ; i++) {

            if (girilenSayi%i==0){
                System.out.print("asal sayi degil");
                break;
            }

            if (i==girilenSayi-1){
                System.out.print("asal sayi");
            }
        }
        System.out.println("");

    }
}
