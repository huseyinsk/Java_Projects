import java.util.Scanner;

public class baskent_sorgulama {

	public static void main(String[] args) {
		/*#Soru 4: Kullanıcıya “Türkiye’nin başkenti hangi şehirdir?”sorusunu sorsun.
		  #Doğru cevap verilene kadar “Yanlış cevap, tekrar deneyiniz!” uyarısını versin
		  #Doğru cevap verildiğinde “Tebrikler, bildiniz” yazısı gösterilsin ve döngüden çıkılsın. */
		
		Scanner input = new Scanner(System.in);
		System.out.print("Türkiyenin başkenti hangi şehirdir? : ");
		String baskent = input.nextLine();
		while(!baskent.equals("ANKARA")) {
			System.out.println("Yanlış cevap verdiniz, lütfen tekrar deneyiniz: ");
			Scanner input2 = new Scanner(System.in);
			System.out.print("Türkiyenin başkenti hangi şehirdir? : ");
			baskent = input.nextLine();
		}System.out.print("Tebrikler, doğru cevap verdiniz."); 
	}

}
