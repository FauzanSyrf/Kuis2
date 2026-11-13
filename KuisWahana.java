import java.util.Scanner;

public class KuisWahana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah pengunjung: ");
        int n = sc.nextInt();
        int totalPendapatan = 0;
        double totalUsia = 0;
        int nim2 = 28;
        int kuotaDewasa = (nim2 % 3) + 2;

        for (int i = 1; i <= n; i++) {
            System.out.print("Usia pengunjung ke-" + i + ": ");
            int usia = sc.nextInt();
            if (usia < 1 || usia > 80 ) {
                System.out.println("tidak valid, ulangi");
            }
            
            // Harga tiket: usia di bawah 12 tahun Rp 25000, selain itu Rp 40000
            int harga;
            int muda = 0;
            muda++;
            if (usia < 12) {
                harga = 25000;
            } else {
                harga = 40000;
            }
            totalPendapatan += harga;
            totalUsia += usia;
            System.out.println("  Harga tiket: Rp " + harga);
            
        }

        double rataUsia = totalUsia / n;
        System.out.println("=== REKAP HARIAN ===");
        System.out.println("jumlah pengunjung muda  :"+ muda);
        System.out.println("Total pendapatan : Rp " + totalPendapatan);
        System.out.println("Rata-rata usia   : " + rataUsia + " tahun");
    }
}