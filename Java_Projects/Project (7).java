import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;

public class Ay_İsimleri {

	public static void main(String[] args) {
		// girilen bir veriye göre hangi ay'a denk geldiğini söyleyen program
		
		Scanner input = new Scanner(System.in);
		System.out.print("Öğrenmek istediğiniz yılı giriniz: ");
		int yil = input.nextInt();
		if(yil % 12 == 0) {System.out.println("Girmiş olduğunuz yıl Maymun Yılıdır.");}
		else if(yil % 12 == 1) {System.out.println("Girmiş olduğunuz yıl Maymun Yılıdır.");}
		else if(yil % 12 == 2) {System.out.println("Girmiş olduğunuz yıl Horoz Yılıdır.");}
		else if(yil % 12 == 3) {System.out.println("Girmiş olduğunuz yıl Köpek Yılıdır.");}
		else if(yil % 12 == 4) {System.out.println("Girmiş olduğunuz yıl Domuz Yılıdır.");}
		else if(yil % 12 == 5) {System.out.println("Girmiş olduğunuz yıl Fare Yılıdır.");}
		else if(yil % 12 == 6) {System.out.println("Girmiş olduğunuz yıl Öküz Yılıdır.");}
		else if(yil % 12 == 7) {System.out.println("Girmiş olduğunuz yıl Kaplan Yılıdır.");}
		else if(yil % 12 == 8) {System.out.println("Girmiş olduğunuz yıl Tavşan Yılıdır.");}
		else if(yil % 12 == 9) {System.out.println("Girmiş olduğunuz yıl Ejderha Yılıdır.");}
		else if(yil % 12 == 10) {System.out.println("Girmiş olduğunuz yıl Yılan Yılıdır.");}
		else {System.out.println("Girmiş olduğunuz yıl Koyun Yılıdır.");}
		
		
	}

}
