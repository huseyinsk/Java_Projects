package HomeWorks;

/*İnsan adlı bir java sınıfı yazınız, bu sınıfın tckimlikno (int), isim (String) ve yaş (int) adlı örnek değişkenleri olsun.
a) sadece tckimlikno verildiğinde, tek parametre (int) alıp, gerekli işlemleri yapan kurucu metodu;
b) isim ve yaş verildiğinde, iki parametre (string,int) alıp, gerekli işlemleri yapan kurucu metodu;
yazınız. Daha sonra a ve b şıklarında verilen kurucu metotları test etmek amacıyla sırasıyla adam (a) ve vatandas (b) 
nesnelerini oluşturup, nesneler hakkında bilgileri ayrı bir test sınıfında ekrana basınız.*/

public class hafta2_Odev2 {      
	int tc_no;
	String isim;
	int yas;
	
	public hafta2_Odev2(int tc_no) {    
		this.tc_no=tc_no;
		System.out.println("TC NO: "+ this.tc_no);}
	
	public hafta2_Odev2(String isim, int yas) { 
		this.isim=isim;
		this.yas=yas; 
		System.out.println("İsim: "+ this.isim + "\nYaşı: "+ this.yas);}
	
	
	public static void main(String[] args) {
		System.out.println("Kişinin bilgileri");
		hafta2_Odev2 adam = new hafta2_Odev2(111111111);  
		hafta2_Odev2 vatandas = new hafta2_Odev2("Hüseyin", 21); 
	}}
