import java.util.Scanner;

public class Zam_Miktari {

	public static void main(String[] args) {
		// Zam miktarını hesaplayan program
		double zam_orani = 0;
		double zam_orani1 = 0.1;
		double zam_orani2 = 0.2;
		double zam_orani3 = 0.3;
		int   maas = 2000;
		Scanner input = new Scanner(System.in);
		System.out.print("Çalışanın yıl sonu puanını giriniz: ");
		int puan = input.nextInt();
		switch(puan) {
			case 0 , 1 , 2:
				System.out.println("Zam oranı: 0    Zam miktarı: " + zam_orani*maas);
				break;
			case 3 , 4 , 5:
				System.out.println("Zam oranı: 0    Zam miktarı: " + zam_orani1*maas);
				break;
			case 6 , 7 , 8:
				System.out.println("Zam oranı: 0    Zam miktarı: " + zam_orani2*maas);
				break;
			case 9 , 10:
				System.out.println("Zam oranı: 0    Zam miktarı: " + zam_orani3*maas);
				break;}
		if(puan > 10 ){System.out.println("Lütfen 0-10 arasında puan giriniz.");}
				

	
	}

}
