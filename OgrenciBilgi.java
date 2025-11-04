/*
 * Ad Soyad: [MUHAMMED ALİ YÜCESU]
 * Ogrenci No: [250541065]
 *
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * 
 */
import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        final double BASARI_ESIK = 2.50; // Sabit değer: başarı eşiği

        Scanner input = new Scanner(System.in);

        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        System.out.print("Adinizi girin: ");
        String ad = input.nextLine();

        System.out.print("Soyadinizi girin: ");
        String soyad = input.nextLine();

        System.out.print("Ogrenci numaraniz: ");
        int ogrenciNo = input.nextInt();

        System.out.print("Yasiniz: ");
        int yas = input.nextInt();

        // GPA girişi — nokta veya virgül fark etmeyecek
        System.out.print("GPA (0.00-4.00): ");
        String gpaStr = input.next();
        gpaStr = gpaStr.replace(',', '.'); // virgülü noktaya çevir
        double gpa = Double.parseDouble(gpaStr);

        input.close();

        System.out.println("=== OGRENCI BILGI SISTEMI ===");
        System.out.printf("Ad Soyad: %s %s%n", ad, soyad);
        System.out.printf("Ogrenci No: %d%n", ogrenciNo);
        System.out.printf("Yas: %d%n", yas);
        System.out.printf("GPA: %.2f%n", gpa);

        // GPA durumunu belirleme (if kullanmadan)
        String durum = (gpa >= BASARI_ESIK) ? "Basarili Ogrenci" : "Gelistirilebilir Ogrenci";
        System.out.println("Durum: " + durum);
    }
}




        
        
        
    
