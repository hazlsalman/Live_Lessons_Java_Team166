package day08_abstraction;

import day07_accessModifier_encapsulation.C04_Datalar;

public class C02_AccessModifier_BaskaPackageChildOlmayanClass {


    public static void main(String[] args) {


    }


    public void method1(){

        C04_Datalar datalar=new C04_Datalar();
        // public variable'lara her yerden ulasilabilir
        System.out.println(datalar.strSPub);
        System.out.println(datalar.strIPub);

        // protected olanlara kendi package'indan veya child class'lardan ulasılabilir
        // datalar.intSPro=45;
        // datalar.intIPro=34;

        //System.out.println(datalar.blSDef);
        //datalar.blIDef=true;

        // Private bir variable'a olusturdugu class disindan ulasilamaz
        // datalar.shrtSPri=22;
        // System.out.println(datalar.shrtIPri);

    }
}
