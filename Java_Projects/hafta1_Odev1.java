package HomeWorks;

// Kullanıcıdan iki sayı isteyin. Kullanıcıdan alınan sayılar üzerinde toplama, çıkarma, 
// çarpma ve bölme işlemlerinden birini kullanıcının seçmesini isteyin. Girilen sayılara 
// seçilen işlemi uygulayın. Sonucu ekrana yazdırın.

import java.util.Scanner;

public class hafta1_Odev1 {
	
	public static double islemYap(String islem,int sayi1, int sayi2) {
		if (islem.equals("toplama")) {return sayi1+sayi2;}
		else if (islem.equals("çıkarma")) {return sayi1-sayi2;}
		else if (islem.equals("bölme")) {return sayi1/sayi2;}
		else {return sayi1*sayi2;}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("İlk sayıyı giriniz: ");
		int ilkSayi = scanner.nextInt();
		System.out.print("İkinci sayıyı giriniz: ");
		int ikinciSayi = scanner.nextInt();
		scanner.nextLine();   
		System.out.print("Yapmak istediğiniz işlemi(toplama/çıkarma/çarpma/bölme) giriniz: ");
		String islem = scanner.nextLine().toLowerCase();
		
		while(!islem.equals("bölme") && !islem.equals("toplama") && !islem.equals("çıkarma") &&!islem.equals("çarpma")) {
			System.out.print("Yanlış girdi yaptınız" + "\nLütfen tekrar işlemi giriniz: ");
			islem = scanner.nextLine().toLowerCase();}
		
		if(ikinciSayi > ilkSayi) {
			System.out.println(islemYap(islem, ikinciSayi, ilkSayi));}
		
		else {
			System.out.println(islemYap(islem, ilkSayi, ikinciSayi));}
		

	}

}
