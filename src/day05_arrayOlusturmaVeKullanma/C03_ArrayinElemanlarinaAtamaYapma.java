package day05_arrayOlusturmaVeKullanma;

import java.util.Arrays;

public class C03_ArrayinElemanlarinaAtamaYapma {

    public static void main(String[] args) {

        String[] isimler={"Ali","Leyla","Can","Canan"};

        // isimler array'ini yazdirin
        System.out.println(isimler); //[Ljava.lang.String;@72ea2f77

        System.out.println(Arrays.toString(isimler)); //[Ali, Leyla, Can, Canan]

        // isimler array'inindeki ilk ismi Kemal olarak degistirin

        isimler[0]="Kemal";
        System.out.println(Arrays.toString(isimler)); // [Kemal, Leyla, Can, Canan]

        // Listeden Can'i silin
        // bu gorev bir ismi silmemizi ve array'i 3 elemanli hala getirmemizi istiyor
        // array'in lenght'i sonradan degistirlemez, ama hiclik atanabilir

        isimler[2]="";
        System.out.println(Arrays.toString(isimler)); // [Kemal, Leyla, , Canan]

        // 5. eleman olarak Yasar'i ekleyin
        // isimler[4]="Yasar"; // ArrayIndexOutOfBoundsException
        // Index 4 out of bounds for lenght 4



    }


}
