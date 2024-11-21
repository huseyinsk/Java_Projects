import java.util.Scanner;

public class Odev_2 {

    public static void main(String[] args) {
		/*Kullanıcıdan parametre olarak bir string değeri isteyiniz. Alınan string değerini ters 
		 * çevirip ekrana yazan java metodunu yazınız. ( TersCevir (String input))*/
    	
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir parametre giriniz: ");
        String parameter = scanner.nextLine();

        tersCevir(parameter);}

    public static void tersCevir(String input) {
        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));}
    }}
