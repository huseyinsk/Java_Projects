package HomeWorks;

import java.util.Scanner;

/*Bir sayının Mükemmel bir sayı olup olmadığını bulan metodu Java programla dilini kullanarak yazınız 
Mükemmel sayı: sayılar teorisinde, kendisi hariç pozitif tam bölenlerinin toplamı kendisine eşit olan sayı olarak tanımlanır.
Diğer bir ifadeyle bir mükemmel sayı, bütün pozitif tam bölenlerinin toplamının yarısına eşittir. 6=> 1 2 3 Mükemmel sayıdır.*/

public class hafta2_Odev1 {
	public static void mukemmelSayi(int sayi){
		int counter = 1;    
		int plus = 0;      
		while(counter<sayi) { 
			if (sayi % counter == 0) {
				plus+=counter;   
				counter++;}
			else {
				counter++;}}  
		
		if(sayi == plus)  
			{System.out.print("Seçtiğiniz "+sayi+" sayısı bir 'Mükemmel sayıdır.'");}
		else   
			{System.out.print("Seçtiğiniz "+sayi+" sayısı bir 'Mükemmel Sayı' değildir.");}}

	public static void main(String[] args) {
		
		Scanner input  = new Scanner(System.in);   
 		System.out.print("Kontrol etmek istediginiz sayıyı giriniz: "); 
		int sayi = input.nextInt();
		mukemmelSayi(sayi);			
			
	}}

