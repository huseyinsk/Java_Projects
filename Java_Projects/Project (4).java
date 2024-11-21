import java.util.Scanner;

public class zor {

	public static void main(String[] args) {
		// # Adını daha sonra soyadını doğru yazana kadar While döngüsünü kullanın.
		Scanner input = new Scanner(System.in);
		System.out.print("Doğru olmasını istediğiniz bir isim giriniz: ");
		String isim = input.nextLine();
		Scanner input2 = new Scanner(System.in);
		System.out.print("Doğru olmasını istediğiniz bir soyisim giriniz: ");
		String soy_isim = input2.nextLine();
		
		while(!isim.equals("hüseyin")) {
			System.out.print("İsimi yanlış girdiniz, lütfen tekrar deneyiniz: ");
			isim = input.nextLine();}
		System.out.println("Tebrikler, isimi doğru girdiniz ");
		
		while(!soy_isim.equals("sarıkaya")) {
			System.out.print("Soyisimi yanlış girdiniz, lütfen tekrar deneyiniz: ");
			soy_isim = input2.nextLine();}
		System.out.println("Tebrikler, soyisimi doğru girdiniz.");
		
	}

}
