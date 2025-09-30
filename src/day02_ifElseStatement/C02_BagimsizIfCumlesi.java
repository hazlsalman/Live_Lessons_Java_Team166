package day02_ifElseStatement;

import java.util.Scanner;

public class C02_BagimsizIfCumlesi {

    // Kullanicidan bir sayi alin
    // sayi pozitif ise "girilen sayi gecerli" yazdirin

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz:");
        int sayi= scanner.nextInt();

        if (sayi>0){
            System.out.println("girilen sayi gecerli");
        }

        boolean sonuc=sayi>0;
        System.out.println("Girilen sayi icin karsilastirma sonucu: "+sonuc);
    }

}
