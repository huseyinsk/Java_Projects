import java.util.Scanner;

public class Faktoriyel_Hesaplama {

	public static void main(String[] args) {
		// # Soru 5: Faktöriyel: dışardan girilen bir sayının faktöriyelini hesaplayınız.
		
		Scanner input = new Scanner(System.in);
		System.out.print("Kontrol etmek istediğiniz sayıyı giriniz: ");
		int sayi = input.nextInt();
		int sonuc = 1; 
		while(sayi > 0) { 
			sonuc *= sayi;
			sayi--;}
		System.out.println("Faktöriyel hesabı: "+ sonuc);
		
	}

}
