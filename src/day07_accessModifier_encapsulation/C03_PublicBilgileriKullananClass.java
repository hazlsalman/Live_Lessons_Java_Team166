package day07_accessModifier_encapsulation;

public class C03_PublicBilgileriKullananClass {

    public static void main(String[] args) {

        System.out.println(C02_PublicBilgilerClasses.hastaneIsmi); // Yildiz Hastanesi

        System.out.println(C02_PublicBilgilerClasses.basHekimIsmi); // Doktor Mehmet

        C02_PublicBilgilerClasses.basHekimIsmi="Doktor Alper";

        System.out.println(C02_PublicBilgilerClasses.basHekimIsmi); // Doktor Alper


    }

}
