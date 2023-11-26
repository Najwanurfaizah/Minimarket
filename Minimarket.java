// Kelas utama sebagai driver

import java.util.Scanner;

public class Minimarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//exception handling
        try {
            System.out.print("No. Faktur: ");
            String nomorFaktur = scanner.nextLine();

            System.out.print("Nama Pelanggan: ");
            String namaPelanggan = scanner.nextLine();

            System.out.print("Nama Barang: ");
            String namaBarang = scanner.nextLine();

            System.out.print("Harga Barang: ");
            double hargaBarang = scanner.nextDouble();

            if (hargaBarang <= 0) {
                throw new IllegalArgumentException("Harga barang harus lebih dari 0.");
            }

            System.out.print("Jumlah Barang: ");
            int jumlahBarang = scanner.nextInt();

            if (jumlahBarang <= 0) {
                throw new IllegalArgumentException("Jumlah barang harus lebih dari 0.");
            }
// Bagian Polymorphisme
            // Membuat objek Barang
            Barang barang = new Barang(namaBarang, hargaBarang);

            // Membuat objek Faktur menggunakan inheritance dari Barang dan implementasi dari KalkulatorPembayaran
            Faktur faktur = new Faktur(nomorFaktur, namaPelanggan, barang, jumlahBarang);

            // Menampilkan informasi faktur
            System.out.println("\nInformasi Faktur:");
            System.out.println("No. Faktur: " + faktur.getNomorFaktur());
            System.out.println("Nama Pelanggan: " + faktur.getNamaPelanggan());
            System.out.println("Nama Barang: " + faktur.getBarang().getNamaBarang());
            System.out.println("Harga Barang: " + faktur.getBarang().getHargaBarang());
            System.out.println("Jumlah Barang: " + faktur.getJumlahBarang());
            System.out.println("Total Bayar: " + faktur.hitungTotalPembayaran(barang.getHargaBarang(), jumlahBarang));
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}