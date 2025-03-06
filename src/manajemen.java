import java.util.Scanner;

public class manajemen {
    public static void main(String[] args) {
        // 1.
        System.out.println("masukkan nama anda: ");
        Scanner input = new Scanner(System.in);
        String nama = input.nextLine();
        System.out.println("Masukkan Usia anda: ");
        int usia = input.nextInt();
        System.out.println("Masukkan jumlah uang yang anda miliki: ");
        double uang = input.nextDouble();
        System.out.println("rata-rata pengeluaran harian: ");
        double rateDaily = input.nextDouble();
 
        // 2.
        double usiaDouble = usia;
        int uangInt = (int) uang;
        System.out.println("Usia dalam double: " + usiaDouble);
        System.out.println("Uang dalam integer: " + uangInt);

        // 3.
        double totalPengeluaran = rateDaily * 30;
        double sisaUang = uang - totalPengeluaran;
        double perhitunganKeuangan = uang / totalPengeluaran;
        int bulanBertahan = (int) perhitunganKeuangan;


        // 4. 
        boolean lebihDari30 = usia > 30;
        boolean more30 = usia > 30 && uang > 10000000;
        boolean less30 = usia < 30 || uang > 5000000;
            
        System.out.println("Apakah usia lebih dari 30? " + lebihDari30);
        System.out.println("Apakah usia > 30 dan uang > 10 juta? " + more30);
        System.out.println("Apakah usia < 30 atau uang > 5 juta? " + less30);
            
        // 5. 
        System.out.println("Masukkan jumlah hutang: ");
        int hutang = input.nextInt(); 
        int hutangAbsolut = Math.abs(hutang);
        double pengeluaranHarian = rateDaily; 
        double pengeluaran = Math.ceil(pengeluaranHarian);
        int bonusTakTerduga = 100000 + (int) (Math.random() * 900000); 
            
        // 6. 
        System.out.println("\n=== LAPORAN KEUANGAN PRIBADI ===");
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia + " tahun"); 
        System.out.println("Uang yang dimiliki: Rp." + uang);
        System.out.println("Pengeluaran harian rata-rata: Rp." + pengeluaranHarian);
        System.out.println("Sisa uang dalam 30 hari: Rp." + sisaUang);
        System.out.println("Status Keuangan: ");
        if (bulanBertahan < 1) {
            System.out.println("PERINGATAN: Keuangan Anda kurang stabil: ");
        } else if (bulanBertahan > 6){
            System.out.println("Keuangan Anda stabil");
        } else {
            System.out.println("Keuangan Anda cukup stabil");
        } 
        System.out.println("Estimasi bulan bertahan: " + perhitunganKeuangan + " bulan");
        System.out.println("Nilai absolut dari hutang: Rp" + hutangAbsolut);
        System.out.println("Pengeluaran harian setelah pembulatan: Rp" + (int) pengeluaran);
        System.out.println("Bonus tak terduga: Rp" + bonusTakTerduga);
        int totalSetelahBonus = (int) (uang - totalPengeluaran + bonusTakTerduga);
        System.out.println("Total uang yang dimiliki setelah pengeluaran dan bonus: Rp" + totalSetelahBonus);
    
        input.close(); // Close the scanner
    }
}
