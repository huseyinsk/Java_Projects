package HomeWorks;

// hafta7_Odev2

public class Arac {
	
	public void hareketEt() {
		System.out.println("Araç hareket ediyor");
		}
	
	public static void main(String[] args) {
		Arac arac = new Arac();
		Otomobil otomobil = new Otomobil();
		Bisiklet bisiklet = new Bisiklet();
		
		arac.hareketEt();
		otomobil.hareketEt();
		bisiklet.hareketEt();
	}

}

class Otomobil extends Arac{
	@Override
	public void hareketEt() {
		System.out.println("Otomobil hareket ediyor");}
}

class Bisiklet extends Arac{
	@Override
	public void hareketEt() {
		System.out.println("Bisiklet hareket ediyor");}
}
