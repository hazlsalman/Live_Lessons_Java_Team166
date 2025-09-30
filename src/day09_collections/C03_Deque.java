package day09_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C03_Deque {

    public static void main(String[] args) {

        List<String> isimler= new LinkedList<>();
        // Data turu List secildigi icin
        // isimler LinkedList bizim daha once gordugumuz
        // ArrayList ile ayni ozelliklere sahip

        Queue<Integer> sayilar= new LinkedList<>();
        // Data turu Queue secildigi icin
        // sayilar LİnkedList FIFO (yani ilk gelen ilk cikar)
        // ozellikleri tasir
        // eklemeler sona yapilir
        // silme islemleri en bastan yapilir
        // aradaki index'lere ekleme veya aradan silme olmaz

        Deque<String> sehirler=new LinkedList<>();
        // data turu Deque(Double ended queue- iki uclu kuyruk) secildigi icin
        // sehirler LinkedList iki uctan ekleme ve
        // cikarma yapacak ozelliklere yani methodlara sahiptir
        // ayni zaman da Deque Queue'nun child'i oldugundan
        // Queue'daki tum method'ları da kullanabilir



        sehirler.add("Adana");
        System.out.println(sehirler); // [Adana]
        sehirler.add("Eskisehir"); // en sona ekler
        System.out.println(sehirler); // [Adana, Eskisehir]

        sehirler.addLast("Ankara"); // en sona ekler
        sehirler.addFirst("Istanbul"); // en basa ekler

        System.out.println(sehirler);  // [Istanbul, Adana, Eskisehir, Ankara]


        // Diger butun method'larda da double ended yapisindan dolayi
        // en basa veya en sona tercihini yapabilecegimiz method'lar barindirir


        sehirler.remove();
        // en bastaki elemani siler ve bize getirir
        sehirler.removeFirst();
        // en bastaki elemani siler ve bize getirir
        sehirler.removeLast();
        // en sondaki elemani siler ve bize getirir

        sehirler.removeFirstOccurrence("Hatay");
        sehirler.removeLastOccurrence("Hatay");

        /*

         [Istanbul,Hatay Adana, Hatay, Eskisehir, Ankara, Hatay]
         remove() : hangi sehir olduguna bakmadan bastaki sehri siler
         removeFirst(): hangi sehir olduguna bakmadan bastaki sehri siler
         removeLast(): hangi sehir olduguna bakmadan en sondaki sehri siler
         removeFirstOccurance("Hatay"): Hatay sehrinin ilk kullanimini siler
         removeLastOccurance("Hatay"): Hatay sehrinin en son kullanimini siler


         */









    }
}
