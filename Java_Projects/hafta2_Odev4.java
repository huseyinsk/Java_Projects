package HomeWorks;

import java.util.Scanner;

public class hafta2_Odev4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sifre;
        
        while (true) {
            System.out.print("Oluşturmak istediğiniz şifreyi giriniz: ");
            sifre = input.nextLine();

            if (sifre.length() < 8) {
                System.out.println("Girdiğiniz şifre en az 8 karakterli olmalıdır.");
                continue;}


            if (!sadeceHarfVeRakam(sifre)) {
                System.out.println("Şifre sadece harf ve rakamlardan oluşmalıdır.");
                continue;}

            if (rakamSayisi(sifre) < 2) {
                System.out.println("Girdiğiniz şifre en az 2 rakam içermelidir.");
                continue;}
            
            System.out.println("Şifreniz başarıyla oluşturuldu.");
            break;}

        input.close();}

    public static int rakamSayisi(String sifre) {
        int count = 0;
        for (char ch : sifre.toCharArray()) {
            if (Character.isDigit(ch)) {
                count++;}}
        return count;}

    
    public static boolean sadeceHarfVeRakam(String sifre) {
        for (char ch : sifre.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) {
                return false;}}
        return true;
        
    }
}






