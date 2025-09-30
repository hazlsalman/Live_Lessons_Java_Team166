package day05_arrayOlusturmaVeKullanma;

public class C01_ArrayOlusturma {


    public static void main(String[] args) {

        int sayi=20;

        // int sayilar={2,3,5,7,8,9} java kabul etmez.Array deger atamasi burda izin verilmez!
        // primitive int olarak olusturulan bir variable'a birden fazla deger atanamaz.


        int sayilar[]={2,3,5,7,8,9}; // ==> char data turunu matematiksel degerini algiladigindan kullanilabilir

        String[] harfler={"a","k","t","s","q","o","p"};

        /*

        [] variable'in primitive data turunde degil
        Array data turunde olusturuldugunu belirtir

        sayilar ve harfler variable'larinin data turu Array'dir.
        bunu [] 'lerden anlariz

        basta yazan int ve String sayilar ve harfler variable'larinin data turu degil
        bu array'lere konulacak elemanlarin data turudur.

        Array olusturulurken iki sey deklere edilmek zorundadir:
        1) icine konulacak elemanlarin data turu
        2) icine kac eleman konulacagi
           EGER Array olusturulurken direkt olarak elemanlar ataniyorsa
           Java Array'in kapasitesi olarak yazilan eleman sayisini kabul eder
           yukaridaki orneklere bakilirsa sayilar array'i 6 int eleman barindirir
           harflar array'i ise 7 String eleman barindirir

           NOT: Array'in olusturuldugu satirda belirlenen eleman sayisi
           sonradan degistirilemez.
           10 kisilik minibusu kesip bicip spor araba yapilamaz

         */



    }
}
