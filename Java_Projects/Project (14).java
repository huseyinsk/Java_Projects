import java.util.Scanner;

public class overloading_plus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Birinci sayıyı giriniz: ");
		int firstNumber = input.nextInt();
		System.out.print("İkinci sayıyı giriniz: ");
		int secondNumber = input.nextInt();
		System.out.print("Üçüncü sayıyı giriniz: ");
		int thirdNumber = input.nextInt();
		System.out.println(plus(firstNumber, secondNumber));
		System.out.println(plus(firstNumber, secondNumber,thirdNumber));    }

	public static int plus(int firstNumber, int secondNumber, int thirdNumber){
		int toplama = firstNumber + secondNumber + thirdNumber;
		return toplama;}
		
	public static int plus(int firstNumber, int secondNumber){
		int toplama_2 = firstNumber + secondNumber;
		return toplama_2;}
}

