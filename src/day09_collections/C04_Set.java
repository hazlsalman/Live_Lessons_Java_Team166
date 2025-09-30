package day09_collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C04_Set {

    public static void main(String[] args) {

        Set<String> isimlerTree=new TreeSet<>();
        Set<String> isimlerHash=new HashSet<>();


        // Set oldugu icin her eleman sadece bir tane bulunabilir
        // TreeSet sectigimiz icin elemanlar dogal sirali olarak tutulur
        // index desteklemez normalda

        isimlerTree.add("Arda");
        isimlerHash.add("Arda");

        isimlerTree.add("Musa");
        isimlerHash.add("Musa");

        isimlerTree.add("Arda");
        isimlerHash.add("Arda");

        isimlerTree.add("Yaprak");
        isimlerHash.add("Yaprak");

        isimlerTree.add("Arda");
        isimlerHash.add("Arda");

        isimlerTree.add("Hazal");
        isimlerHash.add("Hazal");


        System.out.println("Tree Set: "+isimlerTree);
        System.out.println("Hash Set: "+isimlerHash);

        // Set'de index yapisi yoktur
        // HashSet elemanlari kafasina gore siralar

        isimlerTree.add("Kemal");
        isimlerHash.add("Kemal");

        isimlerTree.add("Ziya");
        isimlerHash.add("Ziya");


        System.out.println("Tree Set: "+isimlerTree);
        System.out.println("Hash Set: "+isimlerHash);

        // Set'de index yapisi olmadigindan
        // for loop gibi index kullanan yapilarla degil
        // for each loop gibi index kullanmayan yapilarla
        // Set'in elemanlarini gözden gecirebiliriz.


    }

}
