package HomeWorks;

// Calisan classi

public class hafta7_Odev1 {
	
	private String isim;
	private int yas;
	private double maas;

	public String getIsim() {
		return isim;}
	
	public void setIsim(String isim) {
		this.isim = isim;}
	
	public int getYas() {
		return yas;}

	public void setYas(int yas) {
		if (yas<0) {
			System.out.println("Yaş negatif olamaz!");}
		else {this.yas = yas;}}

	public double getMaas() {
		return maas;}

	public void setMaas(double maas) {
		if (maas<0) {
			System.out.println("Maaş negatif olamaz!");}
		else {this.maas = maas;}}


	public static void main(String[] args) {
		hafta7_Odev1 person = new hafta7_Odev1();
		person.setIsim("Hüseyin");
		String isim = person.getIsim();
		System.out.println("İsminiz: "+ isim);
		person.setYas(-5);
		person.setYas(30);
		int yas = person.getYas();
		System.out.println("Yaşınız: "+yas);
		person.setMaas(-3);
		person.setMaas(30000);
		double maas = person.getMaas();
		System.out.println("Maaşınız: " + maas);
		
		
		

	}

}
