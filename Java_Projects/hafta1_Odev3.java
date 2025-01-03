package HomeWorks;

import java.util.Scanner;

// Kullanıcıdan bir string değer girmesini isteyiniz. Girilen String de kaç 
// adet a harfi olduğunu ekrana yazdıran Java metodunu yazınız.

public class hafta1_Odev3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Kontrol etmek istediğiniz kelimeyi giriniz: ");
		String kelime = scanner.nextLine().toLowerCase();
		int a_counter = 0;
		
		for (int i = 0; i < kelime.length(); i++) {
			char harf = kelime.charAt(i);
			if(harf == 'a') {
				a_counter += 1;}}
		
		System.out.println("Girmiş olduğunuz kelimede "+a_counter+" adet a vardır.");
		

	}

}
