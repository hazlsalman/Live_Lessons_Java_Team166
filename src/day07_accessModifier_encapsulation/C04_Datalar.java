package day07_accessModifier_encapsulation;

public class C04_Datalar {


    public static String strSPub="Public static variable";
    public String strIPub="Public instance String";

    protected  static int intSPro=20;
    protected  int intIPro;

    static boolean blSDef; // default access modifier icin basa default yazilmaz
                        // basta public , protected veya private yoksa java otomatik olarak
                        // default belirler

    boolean blIDef=true;

    private static  short shrtSPri=34;
    private short shrtIPri;



    public static void method1(){

    }

    void method2(){
        System.out.println(strSPub);
        System.out.println(strIPub);
        intSPro=45;
        intIPro=34;
        System.out.println(blSDef);
        blIDef=true;

        shrtSPri=22;
        System.out.println(shrtIPri);
    }


}
