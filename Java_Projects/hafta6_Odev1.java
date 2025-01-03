package HomeWorks;

// Person adında bir class ve özellikleri

public class hafta6_Odev1 {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	

	public static void main(String[] args) {
		hafta6_Odev1 person = new hafta6_Odev1();
		person.setName("Ahmet");
		person.setAge(25);
		int yas = person.getAge();
		String isim = person.getName();
		System.out.println("İsim: "+isim+" yaşı: "+ yas);

	}

}
