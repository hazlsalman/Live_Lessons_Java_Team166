package day05_arrayOlusturmaVeKullanma;

public class C06_ElelmanArama {

    public static void main(String[] args) {

        // Verilen String bir array’de istenen bir elemanin var olup olmadigini
        // ve varsa kac kere kullanildigini yazdirin

        String[] harfler = {"a","d","f","e","a","e","d","a","a","e","a"};
        String arananHarf = "k";

        int sayac=0;
        for (int i = 0; i < harfler.length ; i++) {
            if (arananHarf.equals(harfler[i])){
                sayac++;
            }
        }
        System.out.println("Aranan "+arananHarf+" harfinden array'de "+sayac+" tane var.");

        arananelemanSayisiniYazdir(harfler,"e");
    }



    // Verilen String bir array’de istenen bir elemanin var olup olmadigini
    // ve varsa kac kere kullanildigini yazdirin bir method olusturun

    public static void arananelemanSayisiniYazdir(String[]verilenArr,String arananMetin){
        int sayac=0;
        for (int i = 0; i < verilenArr.length ; i++) {
            if (arananMetin.equals(verilenArr[i])){
                sayac++;
            }
        }
        System.out.println("Aranan "+arananMetin+" harfinden array'de "+sayac+" tane var.");
    }


}


