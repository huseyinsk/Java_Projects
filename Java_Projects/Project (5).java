import java.util.Scanner;

public class zor2 {

	public static void main(String[] args) {
		// # Kullanıcının adını doğru girebilmesi için 3 hak tanıyan döngü

		Scanner input = new Scanner(System.in);
		System.out.println("Bir isim giriniz: ");
		String isim = input.nextLine();
		int a = 0;
		int b = 3;
		
		while(!isim.equals("hüseyin") && a < 4 && b != 0) {
			System.out.print("Yanlış isim girdiniz "+ b + " Deneme hakkınız kaldı: ");
			isim = input.nextLine();
			b--;
			a++;}
		if (isim.equals("hüseyin")){System.out.println("Tebrikler doğru isim girdiniz.");}
		else {System.out.println("Deneme hakkınız kalmadı. Yanlış isim girdiniz");}
	}

}
