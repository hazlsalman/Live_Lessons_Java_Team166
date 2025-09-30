package day05_arrayOlusturmaVeKullanma;

import java.util.Arrays;

public class C04_ElemanlariAtamadanArrayOlusturma {

    public static void main(String[] args) {

        // Bazen Array olusturulurken elemanlar belirlenmemis olabilir
        // ornegin kayit icin 20 kisilik bir sinif olusturulmasi istenebilir
        // ogrenciler geldikce eklenecek

        // Array 2 sekilde olusturulabilir:
        // 1- Onceki class'larda oldugu gibi direkt degerler atanarak
        // 2- Elemanlarin data turu ve eleman sayisi soylenerek
        // 2. yontemle array olusturuldugunda elemanlar atamadigi icin
        // Java belirlenmis default degerleri array'e eleman olarak atama yapar
        // boolean==>false
        // char ==>'' hiclik
        // sayisal data turleri ==> 0
        // non-primiiveler ==> null

        String[] birAsinifi= new String[5];


        // icine 7 tane int eleman koyabilecegimiz bir array olusturun
        int[] sayilar=new int[7];

        System.out.println(Arrays.toString(birAsinifi)); // [null, null, null, null, null]
        System.out.println(Arrays.toString(sayilar)); // [0, 0, 0, 0, 0, 0, 0]

        //birAsinifi'na eleman olarak Ali'yi atayin

        birAsinifi[0]="Ali";
        System.out.println(Arrays.toString(birAsinifi)); // [Ali, null, null, null, null]

    }
}
