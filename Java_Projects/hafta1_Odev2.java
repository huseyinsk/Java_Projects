package HomeWorks;

import java.util.Scanner;

// Kullanıcıdan parametre olarak bir string değeri isteyiniz. Alınan string değerini 
// ters çevirip ekrana yazan java metodunu yazınız. ( TersCevir (String input))

public class hafta1_Odev2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ters çevirmek istediğiniz kelimeyi giriniz: ");
		String kelime = scanner.nextLine();
		String tersCevirilmis = "";
				
		for(int i = kelime.length() - 1; i >= 0; i--) {
			tersCevirilmis += kelime.charAt(i);}
		
		System.out.println(tersCevirilmis);
		
	}
}
