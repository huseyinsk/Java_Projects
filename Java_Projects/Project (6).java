import java.util.Scanner;

public class asal_sayi {

	public static void main(String[] args) {
		/* #Soru 11: Asal sayılar, yalnızca 1 ve kendisi ile tam olarak bölünebilen pozitif tam sayılardır.
			#Şimdi sizden, kullanıcının girdiği bir sayının asal olup olmadığını kontrol eden
			#ve sonucu ekrana yazdıran bir Python programı yazmanızı istiyoruz */

		Scanner input = new Scanner(System.in);
		System.out.print("Test etmek istediğiniz sayıyı giriniz: ");
		int sayi = input.nextInt();
		int a = sayi;
		boolean check = true;
		while (a > 2) {
			if(sayi % (a-1) == 0) {
				System.out.println("Girmiş olduğunuz " + sayi + " sayısı bir asal sayı değildir.");
				check = false;
				break;}
			a--;}
		if (check == true) {System.out.println("Girmiş olduğunuz sayı bir asal sayıdır.");}
	}

}
