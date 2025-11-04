/*
 * Ad Soyad: [MUHAMMED ALİ YÜCESU]
 * Ogrenci No: [250541065]
 * Dosya: MaasHesap.java
 * Aciklama: Çalışan bilgilerini alıp detaylı maaş bordrosu oluşturan program.
 * Görev 3 Maaş Hesap
 */

import java.util.Scanner;

public class MaasHesap {
    public static void main(String[] args) {
        final double SGK_ORANI = 0.14;
        final double GELIR_VERGISI_ORANI = 0.15;
        final double DAMGA_VERGISI_ORANI = 0.00759;

        Scanner input = new Scanner(System.in);

        System.out.println("=== MAAS HESAPLAMA SISTEMI ===");
        System.out.print("Calisan ad soyad: ");
        String adSoyad = input.nextLine(); // nextLine kullanımı, boşluklu isimler için

        System.out.print("Aylik brut maas (TL): ");
        double brutMaas = input.nextDouble();

        System.out.print("Haftalik calisma saati: ");
        int haftalikSaat = input.nextInt();

        System.out.print("Mesai saati: ");
        int mesaiSaati = input.nextInt();

        input.close();

        // --- Gelir Hesaplamaları ---
        double mesaiUcreti = (brutMaas / 160) * mesaiSaati * 1.5;
        double toplamGelir = brutMaas + mesaiUcreti;

        // --- Kesintiler ---
        double sgk = toplamGelir * SGK_ORANI;
        double gelirVergisi = toplamGelir * GELIR_VERGISI_ORANI;
        double damgaVergisi = toplamGelir * DAMGA_VERGISI_ORANI;
        double toplamKesinti = sgk + gelirVergisi + damgaVergisi;

        // --- Net Maaş ---
        double netMaas = toplamGelir - toplamKesinti;

        // --- İstatistikler ---
        double kesintiOrani = (toplamKesinti / toplamGelir) * 100;
        double saatlikNetKazanc = netMaas / 176.0; // 22 gün × 8 saat
        double gunlukNetKazanc = netMaas / 22.0;

        // --- Çıktı ---
        System.out.println("====================================");
        System.out.println("           MAAS BORDROSU            ");
        System.out.println("====================================");
        System.out.printf("Calisan: %s%n", adSoyad);
        System.out.println("GELIRLER:");
        System.out.printf("Brut Maas              : %10.2f TL%n", brutMaas);
        System.out.printf("Mesai Ucreti (%d saat) : %10.2f TL%n", mesaiSaati, mesaiUcreti);
        System.out.println("------------------------");
        System.out.printf("TOPLAM GELIR           : %10.2f TL%n", toplamGelir);

        System.out.println("KESINTILER:");
        System.out.printf("SGK Kesintisi (%.1f%%)        : %10.2f TL%n", SGK_ORANI * 100, sgk);
        System.out.printf("Gelir Vergisi (%.1f%%)        : %10.2f TL%n", GELIR_VERGISI_ORANI * 100, gelirVergisi);
        System.out.printf("Damga Vergisi (%.1f%%)        : %10.2f TL%n", DAMGA_VERGISI_ORANI * 100, damgaVergisi);
        System.out.println("------------------------");
        System.out.printf("TOPLAM KESINTI         : %10.2f TL%n", toplamKesinti);
        System.out.printf("NET MAAS               : %10.2f TL%n", netMaas);
        System.out.println("====================================");
        System.out.printf("Kesinti Orani          : %.1f%%%n", kesintiOrani);
        System.out.printf("Saatlik Net Kazanc     : %.2f TL%n", saatlikNetKazanc);
        System.out.printf("Gunluk Net Kazanc      : %.2f TL%n", gunlukNetKazanc);
        System.out.println("====================================");
    }
}
