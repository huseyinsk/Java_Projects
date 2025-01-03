package HomeWorks;

import java.lang.classfile.Superclass;

import javax.imageio.stream.ImageInputStreamImpl;

// OOP'de Çalışanlar adı altında proje

public abstract class Calisan {
	private String ad;
	private String soyad;
	private int telefon;
	
	public abstract void giris();
	public abstract void cikis();
	public abstract void yemek();
	
	public String getAd() {
		return ad;}

	public void setAd(String ad) {
		this.ad = ad;}

	public String getSoyad() {
		return soyad;}

	public void setSoyad(String soyad) {
		this.soyad = soyad;}

	public int getTelefon() {
		return telefon;}

	public void setTelefon(int telefon) {
		this.telefon = telefon;}
	
	public static void main(String[] args) {   /// MAİN 
		Asistan asistan = new Asistan();
		asistan.setGorev("Lisansüstü");
		asistan.giris();
		asistan.yemek();
		String gorev = asistan.getGorev();
		System.out.println("Asistanın görevi: "+ gorev);
		asistan.quizleriOku();
		asistan.lablaraGir();
		asistan.cikis();
		System.out.println("------ Öğretmen için --------");
		Ogretmen ogretmen = new Ogretmen();
		ogretmen.giris();
		ogretmen.setAd("Hüseyin");
		String isim = ogretmen.getAd();
		System.out.println("Öğretmenin ismi: "+isim);
		ogretmen.toplantiGir();
		ogretmen.sinavlaraGir();
		ogretmen.cikis();
	}
	
}

class Akademisyen extends Calisan{
	private String girilenDers;
	private String gorev;
	private String unvan;
	
	public String getUnvan() {
		return unvan;}

	public void setUnvan(String unvan) {
		this.unvan = unvan;}

	public String getGorev() {
		return gorev;}

	public void setGorev(String gorev) {
		this.gorev = gorev;}

	public String getGirilenDers() {
		return girilenDers;}

	public void setGirilenDers(String girilenDers) {
		this.girilenDers = girilenDers;}

	@Override
	public void giris() {}

	@Override
	public void cikis() {}

	@Override
	public void yemek() {}
}

class Asistan extends Akademisyen{
	public void lablaraGir() {
		System.out.println("Asistan lablara girdi");}
	
	public void quizleriOku() {
		System.out.println("Asistan quizleri okudu");}
	
	@Override
	public void giris() {
		System.out.println("Asistan giriş yaptı");}

	@Override
	public void cikis() {
		System.out.println("Asistan çıkış yaptı");}

	@Override
	public void yemek() {
		System.out.println("Asistan yemek yedi");}
}


class Ogretmen extends Akademisyen{
	public void sinavlaraGir() {
		System.out.println("Sınavlara girildi");}

	public void toplantiGir() {
		System.out.println("Toplantıya girildi");}
	@Override
	public void giris() {
		System.out.println("Öğretmen giriş yaptı");}

	@Override
	public void cikis() {
		System.out.println("Öğretmen çıkış yaptı");}

	@Override
	public void yemek() {
		System.out.println("Öğretmen yemek yedi");}
}







