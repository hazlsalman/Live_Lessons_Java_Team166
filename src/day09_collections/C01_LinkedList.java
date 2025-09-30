package day09_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C01_LinkedList {

    public static void main(String[] args) {

       // List<String> isimlerListesi=new List<>();
        // List abstract oldugundan direk obje olusturulamaz
        // Abstract yapilardan obje olusturumak icin childe class'larinin
        // constructor'i kullanilabilir
        List<String> isimlerListesi= new LinkedList<>();

        //Queue<Integer> sayilarQueue=new Queue<>();
        // Queue abstract oldugundan direk obje olusturulamaz
        Queue<Integer> sayilarQueue=new LinkedList<>();

        // Deque<Integer> numbersDeque=new Deque<>();
        // Dequq abstaract oldugundan direk obje olusturulamaz
        Deque<Integer> numbersDeque=new LinkedList<>();

        LinkedList<String> sehirler=new LinkedList<>();


    }

}
