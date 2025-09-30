package day03_stringManipulations;

public class C04_EqualsIgnoreCase {
    public static void main(String[] args) {

        String s1="Ali";

        System.out.println(s1.equals("ali")); // false
        System.out.println(s1.equals("ALI")); //false
        System.out.println(s1.equals("Ali ")); // false


        // EGER karsilastirirken SADECE case farkliliklarini onemsememek isterseniz

        System.out.println(s1.equalsIgnoreCase("ali")); // true
        System.out.println(s1.equalsIgnoreCase("ALI")); // true
        System.out.println(s1.equalsIgnoreCase("Ali ")); // false


    }
}
