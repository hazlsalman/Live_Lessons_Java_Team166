package day07_accessModifier_encapsulation;

public class C06_GormeVeAtamaYetkileriniAyirma {


    public static void main(String[] args) {

        C04_Datalar datalar=new C04_Datalar();

        // Encapsulation'in temel amaci
        // bir datayi goruntuleme (READ yetkisi) ve
        // o data'ya deger atama (WRITE yetkisi) yetkilerini birbirinden ayirmaktir

        // Bunu access modifier ile YAPAMAYIZ
        // Access modifier ile bir variable'a ulasilabiliyorsa
        // hem degeri gorunur hem de deger atanabilir

        System.out.println(datalar.strSPub); // Public static variable
        datalar.strSPub="Yeni Deger";
        System.out.println(datalar.strSPub); // Yeni Deger

        System.out.println(datalar.intIPro);// 0
        datalar.intIPro=55;
        System.out.println(datalar.intIPro); // 55

        // Access modifier ile bir variable'a ulasilamiyorsa
        // ne deger gorunur ne de deger atanabilir

        // System.out.println(datalar.shrtSPri);
        // datalar.shrtSPri=33;


    }
}
