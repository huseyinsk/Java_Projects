import java.util.Scanner;

public class Odev_3 {

	public static void main(String[] args) {
		/*Kullanıcıdan bir string değer girmesini isteyiniz. Girilen String 
		 * de kaç adet a harfi olduğunu ekrana yazdıran Java metodunu yazınız.*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Kontrol etmek istediğiniz kelimeyi giriniz: ");
        String kelime = scanner.nextLine();
        int a_sayac = sayac(kelime);
        System.out.println(a_sayac + " tane 'a' harfi vardır.");
}
    public static int sayac(String kelime) {
        int counter = 0;
        for (int i = 0; i < kelime.length(); i++) {
            char a = kelime.charAt(i);
            
            if (a == 'a' || a == 'A') {
                counter++;}}
        	return counter;}
}
