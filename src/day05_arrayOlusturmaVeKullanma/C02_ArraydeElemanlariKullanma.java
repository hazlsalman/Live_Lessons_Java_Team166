package day05_arrayOlusturmaVeKullanma;

import java.util.Arrays;

public class C02_ArraydeElemanlariKullanma {


    public static void main(String[] args) {

        int[] sayilar={3,5,8,1,3,5};

        // sayilarin data turu array
        // icine konulacak elemanlarin data turu int
        // sayilar array'inin lenght'i (icine konulacak eleman sayisi) 6'dir ve
        // olusturuldugu 8. satirdan sonra lenght degistirilemez

        // sayilar array'inin ilk elemanini yazdirin
        System.out.println(sayilar[0]); //3

        // sayilar array'inin 4. index'teki elemanini yazdirin
        System.out.println(sayilar[4]); //3

        // sayilar array'ini yazdirin
        System.out.println(sayilar); //[I@72ea2f77

        // biz tum array'i degil ama array'in tum elemanlarini yazdirabiliriz
        System.out.println(sayilar[0] + " "+sayilar[1] + " "+sayilar[2]+ " "+ sayilar[3]
        +" "+ sayilar[4]+" "+sayilar[5]+"\n");

        // yukarida tek tek yazdirdigimiz elemanlari loop ile yazdirabiliriz
        for (int i = 0; i <6 ; i++) {
            System.out.print(sayilar[i]+" ");
         // 3 5 8 1 3 5
        }
        System.out.println("");

        // EGER tum array'i yazdirmak isterseniz
        // Java Arrays class'indan hazir method kullanabiliriz

        System.out.println(Arrays.toString(sayilar)); // [3, 5, 8, 1, 3, 5]

        // Tum array'i yazdirdigimizda Java elemanlarin arasina virgul ve bosluk birakir


    }
}
