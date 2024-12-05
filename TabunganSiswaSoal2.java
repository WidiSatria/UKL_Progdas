package soal ;
public class TabunganSiswaSoal2 {
    public static void main(String[] args) {
        int totalTabungan = 0; // "Variabel untuk menyimpan total tabungan"
        int tabunganBulanIni = 100000; // "Jumlah tabungan bulan pertama"
        int kenaikanBulan = 50000; // "Kenaikan jumlah tabungan setiap bulan"
        
        // "Perulangan untuk menghitung tabungan setiap bulan selama 12 bulan"
        for (int bulan = 1; bulan <= 12; bulan++) {
            totalTabungan += tabunganBulanIni; // "Menambahkan jumlah tabungan bulan ini ke total"
            System.out.println("Bulan ke-" + bulan + ": Rp" + tabunganBulanIni); // "Mencetak jumlah tabungan bulan ini"
            tabunganBulanIni += kenaikanBulan; // "Meningkatkan jumlah tabungan bulan berikutnya"
        }
        
        // "Mencetak total tabungan setelah 12 bulan"
        System.out.println("\nTotal tabungan yang terkumpul setelah 12 bulan adalah: Rp" + totalTabungan);
    }
}