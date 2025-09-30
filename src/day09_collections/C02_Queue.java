package day09_collections;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C02_Queue {

    public static void main(String[] args) {

        List<String> isimler= new LinkedList<>();
        // Bugune kadar List data turunde hep ArrayList kullandik
        // isimler icin data turu yine List
        //  AMA constructor degisti
        // isimler icin bugune kadar kullandigimiz
        // ArrayList ozellikleri disinda bir ozellik var mi ?

        // yeni hicbir method yok





        // Queue(kuyruk) yapisinda FIFO gecerlidir
        // yeni eklenenler en sona eklenir.
        // Silinecekler en bastan silinir.

        Queue<Integer> sayilar= new LinkedList<>();

        // eskiden kullandigimiz List'de iki tane add method'u vardi
        // bir tanesi eklenen elementi en sona ekliyordu
        // digeri ise istedigimiz index'e eleman eklememizi sağlıyordu
        // queue FIFO geregi araya eleman eklememize izin veren method'u
        // kullanmamiza izin vermez

        sayilar.add(3);
        sayilar.add(7);
        sayilar.add(2);
        sayilar.add(9);

        System.out.println(sayilar); // [3, 7, 2, 9]

        // Queue kuyruk oldugundan silmenin en bastan yapilmasi gerekir

        sayilar.remove();
        // Queue'nun basindaki elementi siler ve method'un calistigi yere getirir
        System.out.println(sayilar); // [7, 2, 9]

        System.out.println(sayilar.remove()); // 7
        System.out.println(sayilar); // [2, 9]

        System.out.println(sayilar.size()); // 2

        sayilar.clear();
        System.out.println(sayilar);

        sayilar.add(30);
        sayilar.add(73);
        sayilar.add(25);
        sayilar.add(98);

        System.out.println(sayilar); // [30, 73, 25, 98]

        sayilar.poll();
        // Queue'nun basindaki elementi siler ve method'un calistigi yere getirir
        // Eger queue bos ise null dondurur


        // remove() ve poll() arasindaki fark ikisi de ilk
        // elemani siler ve döndürür
        // aralarindaki fark bos bir Queue'da calistirildiklerinda
        // remove() exception firlatir poll() ise null döndürür

        System.out.println(sayilar);  // [73, 25, 98]

        System.out.println(sayilar.peek()); // 73
        // ilk elemani silmeden döndürür
        System.out.println(sayilar); // [73, 25, 98]

        sayilar.offer(88);
        // Verilen 88'i Queue'ya ekler
        // yani add() ile  ayni islevi yapar
        // sadece bir kucuk bir farkla
        // EGER Queue icin bir eleman sayisi sinirlamasi varsa
        // offer() siniri asan durumlarda elemani eklemez
        // diger bir degisle 88'in eklenmesini teklif eder
        // yeriniz varsa eklemek istiyorum der


        sayilar.element();
        // peek() ile ayni islevi yapar
        // tek bir farkla EGER Queue bossa eleman getiremez
        // ve exception firlatir
        // peek() ise bos Queue'da calistiginda eleman getiremez
        // onun yerine null döndürür


    }
}
