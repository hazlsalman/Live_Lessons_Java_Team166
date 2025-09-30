package day07_accessModifier_encapsulation;

public class C05_AyniPackagedakiBaskaClass {


    public static void main(String[] args) {


    }

    public void method1(){
        // baska bir class'daki variable'lara ulaşmak icin obje olusturalim

        C04_Datalar datalar=new C04_Datalar();

        System.out.println(datalar.strSPub);
        System.out.println(datalar.strIPub);
        datalar.intSPro=45;
        datalar.intIPro=34;
        System.out.println(datalar.blSDef);
        datalar.blIDef=true;

        // Private bir variable'a olusturdugu class disindan ulasilamaz
        // datalar.shrtSPri=22;
        // System.out.println(datalar.shrtIPri);


    }


}
