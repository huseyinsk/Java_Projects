
public class bir_ile_elli_arasi_tek {

	public static void main(String[] args) {
		// 1-50 arası tek sayıları ve çift sayıları yazdıran program
		int sayi = 1;
		while (sayi < 51){
			if (sayi % 2 == 0) {
				System.out.println(sayi +" Bir çift sayıdır");}
			else {System.out.println(sayi + " Bir tek sayıdır");}
			sayi++;
		}
	}

}
