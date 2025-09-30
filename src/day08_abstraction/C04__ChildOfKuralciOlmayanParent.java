package day08_abstraction;

public class C04__ChildOfKuralciOlmayanParent extends C03_KuralciOlmayanParent{


    /*
    Java'da inheritance icin kral childe class'dir.
    - Child class istedigi class'i extends keyword kullanarak
    parent edinebilir

    - Child class isterse parent class'daki tum methodlari
    direkt kullanabilir

    - Child class isterse parent class da var olan methodlari
    kendisine uyarlayabilir (implement)

    - Child class isterse parent class da olmayan yeni methodlar
    barindirabilir

     */

    public static void main(String[] args) {


    }

    public void methodKullanma(){
        method1();
        method2();
        method3();
    }

    public String method2(){

        return "Yasasin Child Class";
    }


    public void method7(){


    }




}
