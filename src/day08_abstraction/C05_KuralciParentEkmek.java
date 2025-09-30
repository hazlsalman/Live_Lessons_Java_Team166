package day08_abstraction;

public abstract class C05_KuralciParentEkmek {

    /*
    - Bir class'in kendisini parent edinecek child class'lar icin
    kural koyup koymayacaginin bastan belirlenmesi gerekir

    bunun icin class'in "abstract" olarak isaretlenmesi gerekir

    - Kural koymak icin abstract yapilan bir class'da hangi methodlarin
    child class'lar icin zorunlu , hangi class'larin ise zorunlu olmadiginin
    belirlenmesi lazim

    - zorunlu olmayan method'lar bugune kadar olusturdugumuz method'lar gibi olur

    - child class'larin bulundurmasi zorunlu olan methodlar ise
    abstract method olmalidir

    abstract method'lar bugune kadar kullandigimiz method'lardan farklidir
    abstract method'lar standartlarda gecen CUMLELER gibidir
    amac klasik bir method olusturmak degil
    "cild class'lar un method'u bulundurmak zorundadir" demektir

     */


    // Zorunlu method'lar

    // un
    //public abstract void un(){
        // Abstract methods cannot have a body

    //}

    // soyut method body'si olmayan method demektir

    public abstract void un();
    //abstract method'lar standartlarda gecen CUMLELER gibidir
    // amac klasik bir method olusturmak degil
    //"cild class'lar un method'u bulundurmak zorundadir" demektir


    // bicim

    public abstract void bicim();

    // gramaj

    public abstract void gramaj();


    // Zorunlu olmayan method'lar

    // maya
    public static void maya(){

        System.out.println("ekmekler maya kullanabilir ama zorunlu degil");
    }

    // tuz

    public static void tuz(){

        System.out.println("ekmekler tuz kullanabilir ama zorunlu degil");
    }



}
