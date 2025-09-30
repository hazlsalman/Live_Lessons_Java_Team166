package day02_ifElseStatement;

import java.util.Scanner;

public class C06_TopluSonucDegerlendirme {

    // kullanicidan 2 tam sayi alin
    // 1- sayi1 < sayi2 ise "birinci sayi daha kucuk" yazdirin
    // 2- sayi1 pozitif ise "birinci sayi sifirdan buyuk" yazdirin
    // 3- sayi2 50'den buyuk ise "ikinci sayi 50'den buyuk" yazdirin
    // 4- sayi2 5 ile bolunebiliyorsa "ikinci sayi 5'in tam kati" yazdirin

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen iki tam sayi giriniz:");
        int sayi1= scanner.nextInt();
        int sayi2=scanner.nextInt();


        // 1- sayi1 < sayi2 ise "birinci sayi daha kucuk" yazdirin
        if (sayi1<sayi2){
            System.out.println("birinci sayi daha kucuk");
        }

        // 2- sayi1 pozitif ise "birinci sayi sifirdan buyuk" yazdirin
        if (sayi1>0){
            System.out.println("birinci sayi sifirdan buyuk");
        }

        // 3- sayi2 50'den buyuk ise "ikinci sayi 50'den buyuk" yazdirin
        if (sayi2>50){
            System.out.println("ikinci sayi 50'den buyuk");
        }

        // 4- sayi2 5 ile bolunebiliyorsa "ikinci sayi 5'in tam kati" yazdirin
        if (sayi2%5==0){
            System.out.println("ikinci sayi 5'in tam kati");
        }

        // 5-EGER konsolda yukaridakilerden hicbiri yazdirilmazsa
        //  "Nasil sayi sectiniz , hicbir sarti saglamiyor" yazdirin

        // 1.yontem yukardaki dört sartin hepsinin terslerini AND ile birlestirelim

        if (!(sayi1<sayi2) && !(sayi1>0) && !(sayi2>50) && !(sayi2%5==0)){
            System.out.println("Nasil sayi sectiniz , hicbir sarti saglamiyor");
        }





    }
}
