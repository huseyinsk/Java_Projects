package HomeWorks;

import java.io.*;
import java.util.Scanner;

public class hafta5_Odev1 {
    
    public static void main(String[] args) throws IOException {
        
        File dosya = new File("giris.txt");
        File ciktiDosya = new File("cikis.txt");
        
        if (!dosya.exists()) {
            dosya.createNewFile();}
        
        if (!ciktiDosya.exists()) {
            ciktiDosya.createNewFile();} 
        
        FileWriter fWriter = new FileWriter(dosya, true);
        BufferedWriter bWriter = new BufferedWriter(fWriter);
        bWriter.write("Ali Demir 51 60\n");
        bWriter.write("Ayşe Bakır 80 100\n");
        bWriter.close();
        
        Scanner giris = new Scanner(dosya);  
        FileWriter ciktiWriter = new FileWriter(ciktiDosya);
        BufferedWriter ciktiBWriter = new BufferedWriter(ciktiWriter);
        
        while (giris.hasNextLine()) {  
            String line = giris.nextLine(); 
            String[] parts = line.split(" ");
            String isim = parts[0];
            String soyisim = parts[1];
            int vizeNotu = Integer.parseInt(parts[2]);
            int finalNotu = Integer.parseInt(parts[3]);
            double ortalama = (vizeNotu * 0.4) + (finalNotu * 0.6);
            ciktiBWriter.write(isim + " " + soyisim + " " + vizeNotu + " " + finalNotu + " " + ortalama + "\n");}

        giris.close();
        ciktiBWriter.close();
    }
}