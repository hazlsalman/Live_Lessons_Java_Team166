package day02_ifElseStatement;

import java.util.Scanner;

public class C03_BagimsizIfCumleleri {

    // kullanicidan bir sayi isteyin
    // girilen sayiyi kontrol edin ve 50'den kucukse
    // degerini 20 artirin
    // son degeri bir daha kontrol edip sayi 50'den buyukse
    //"gorev tamamlandı" yazdirin

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz:");
        int girilenSayi= scanner.nextInt();



        if (girilenSayi<50){
            girilenSayi +=20;
            if (girilenSayi>50){
                System.out.println("gorev tamamlandi");
            }
        }




    }
}
