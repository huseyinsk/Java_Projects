import java.util.Scanner;

public class ÜcgenCesidi {

	public static void main(String[] args) {
		// Girilen verilerle üçgenin tipini belirten bir kod yazınız
		Scanner input = new Scanner(System.in);
		System.out.print("1. Kenar uzunluğunu giriniz: ");
		int ilkKenar = input.nextInt();
		System.out.print("2. Kenar uzunluğunu giriniz: ");
		int ikinciKenar = input.nextInt();
		System.out.print("3. Kenar uzunluğunu giriniz: ");
		int ücüncüKenar = input.nextInt();
		if(ilkKenar == ikinciKenar && ikinciKenar == ücüncüKenar){
			System.out.println("Üçgen bir eşkenar üçgendir.");}
		else if(ücüncüKenar == ilkKenar && ilkKenar != ikinciKenar) {
			System.out.println("Girmiş olduğunuz üçgen ikizkenardır");}
		else if(ilkKenar==ikinciKenar && ikinciKenar != ücüncüKenar || ikinciKenar == ücüncüKenar && ücüncüKenar != ilkKenar) {
			System.out.println("Girmiş olduğunuz üçgen ikizkenardır");}
		else {
			System.out.println("Girmiş olduğunuz bir çeşitkenar üçgendir.");
		}
		
		
	}

}
