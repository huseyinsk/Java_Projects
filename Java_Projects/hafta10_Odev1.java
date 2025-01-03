package HomeWorks;

import java.util.Scanner;

public class hafta10_Odev1 {
	private static String isim;
	private static String soyad;
	private static String email;
	private static int dogumYili;
	private static double boy;
	private static double kilo;
	static int kullaniciSayisi = 0;
	
	public String getIsim() {
		return isim;}

	public void setIsim(String isim) {
		this.isim = isim;}

	public String getSoyad() {
		return soyad;}

	public void setSoyad(String soyad) {
		this.soyad = soyad;}

	public String getEmail() {
		return email;}

	public void setEmail(String email) {
		if(email.contains("@")) {this.email = email;}
		else {System.out.println("Yanlış email girdisi yaptınız");}}

	public int getDogumYili() {
		return dogumYili;}

	public void setDogumYili(int dogumYili) {
		this.dogumYili = dogumYili;}

	public double getBoy() {
		return boy;}

	public void setBoy(double boy) {
		this.boy = boy;}

	public double getKilo() {
		return kilo;}

	public void setKilo(double kilo) {
		this.kilo = kilo;}
	
	public static int yasDondur(int dogumYili) {
		int yas = 2022 - dogumYili;
		return yas;}

	public static void bilgiOlustur(String ad, String soyad,double boy,int dogumYili, String email, double kilo) {
		hafta10_Odev1 person = new hafta10_Odev1();
		kullaniciSayisi++;
		System.out.println("Her oluşturulan kişi(nesne) için kullanıcı sayısı +1 arttırıldı");
		System.out.println("Aktif kullanıcı sayısı: "+kullaniciSayisi);
		person.setIsim(ad);
		person.setSoyad(soyad);
		person.setBoy(boy);
		person.setDogumYili(dogumYili);
		person.setEmail(email);
		person.setKilo(kilo);
		while(!email.contains("@")) {
			System.out.println("Lütfen tekrar deneyiniz!");
			Scanner scanner = new Scanner(System.in);
			System.out.print("Emailinizi giriniz: ");
			String yeniEmail = scanner.nextLine();
			email = yeniEmail;
			person.setEmail(yeniEmail);}}
	
	public static void bilgiPaylas() {
		hafta10_Odev1 person = new hafta10_Odev1();
		String isim = person.getIsim();
		String soyad = person.getSoyad();
		double boy = person.getBoy();
		int dogumYili = person.getDogumYili();
		String email = person.getEmail();
		double kilo = person.getKilo();
		int yas = yasDondur(dogumYili);
		System.out.println("Kullanıcı sıranız: " + kullaniciSayisi);
		System.out.println("Adınız: "+ isim+ "\nSoyadınız: "+soyad+ "\nDoğum yılınız: "+dogumYili);
		System.out.println("Boyunuz: "+boy+"\nKilonuz: "+kilo+ "\nEmailiniz: "+email);
		System.out.println("Yaşınız: "+ yas);
		
		}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("İsminizi giriniz: ");
		String isim = scanner.nextLine();
		System.out.print("Soyisiminizi giriniz: ");
		String soyad = scanner.nextLine();
		System.out.print("email'inizi giriniz: ");
		String email = scanner.nextLine();
		System.out.print("Boyunuzu giriniz: ");
		double boy = scanner.nextDouble();
		System.out.print("Kilonuzu giriniz: ");
		double kilo = scanner.nextDouble();
		System.out.print("Dogum yılınızı giriniz: ");
		int dogumYili = scanner.nextInt();
		bilgiOlustur(isim, soyad, boy, dogumYili, email, kilo);
		bilgiPaylas();
	}

}
