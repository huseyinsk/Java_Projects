package HomeWorks;
import java.util.Random;

// elemanları rastgele üretilen bir matris oluşturulacaktır. Daha sonra her bir satırın ve 
// sütunun toplamı yapılacaktır. Bu metotları ve ana programı ile gerekli Java programını yazınız

public class hafta2_Odev3 {

	public static int[][] matrisUret (int m, int n){
		Random random = new Random();
		int[][] matris = new int[m][n];
		for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matris[i][j] = random.nextInt(100);}}
		return matris;
				
	}
	
		
	public static void satirsutunTop(int[][] matris){
		int m = matris.length;
        int n = matris[0].length;
        int toplam = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                toplam += matris[i][j];}}
        System.out.println("Toplamı: "+ toplam);
	}
		
	
	public static void main(String[] args) {
		Random random = new Random(); 
		int m = random.nextInt(10);
		int n = random.nextInt(10);
		int matris[][] = matrisUret(m, n);
		satirsutunTop(matris);
		
		
	}
	
}
