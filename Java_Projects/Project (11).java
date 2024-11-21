import java.util.Scanner;

public class Odev_1 {

	public static void main(String[] args) {
		/*Kullanıcıdan iki sayı isteyin. Kullanıcıdan alınan sayılar üzerinde toplama, çıkarma, çarpma ve bölme işlemlerinden 
		 * birini kullanıcının seçmesini isteyin. Girilen sayılara seçilen işlemi uygulayın. Sonucu ekrana yazdırın.*/

		Scanner scanner = new Scanner(System.in);
		System.out.print("Birinci sayıyı giriniz: ");
		int firstNumber = scanner.nextInt();
		System.out.print("İkinci sayıyı giriniz: ");
		int secondNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Hangi işlemi yapmak istediğinizi giriniz: ");
		String islem = scanner.nextLine().toLowerCase();
		System.out.println(function(firstNumber, secondNumber, islem));}
	
	
	public static int function(int firstNumber, int secondNumber, String islem){
		if (islem.equals("toplama")) {return firstNumber + secondNumber;}
		else if (islem.equals("çıkarma")) {return firstNumber - secondNumber;}
		else if (islem.equals("bölme")) {return secondNumber/firstNumber;}
		else {return firstNumber*secondNumber;}
	}
}
