package day08_abstraction;

import day07_accessModifier_encapsulation.C04_Datalar;

public class C01_accessModifier_BaskaPackageChildClass extends C04_Datalar {

    // extends C04_Datalar : yazilan bu kodlar bu class'i C04_Datalar Class'inin child'i yapar

    public static void main(String[] args) {


    }

    public void method3(){
        System.out.println(strSPub);
        System.out.println(strIPub);
        intSPro=45; // baska package da olsak da child class oldugu icin ulasabiliyor
        intIPro=34;

        // Default access modifier'a sahip olan variable'lar veya methodlar
        // kendi package 'larinin disindan kullanilamaz
        // System.out.println(blSDef);
        // blIDef=true;


        // private variable sadece olusturuldugu class disinda KUllanilamaz
        // shrtSPri=22;
        // System.out.println(shrtIPri);



    }
}
