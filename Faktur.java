
class Faktur implements KalkulatorPembayaran { // Inheritance
    private String nomorFaktur;
    private String namaPelanggan;
    private Barang barang;
    private int jumlahBarang;

    public Faktur(String nomorFaktur, String namaPelanggan, Barang barang, int jumlahBarang) {
        this.nomorFaktur = nomorFaktur;
        this.namaPelanggan = namaPelanggan;
        this.barang = barang;
        this.jumlahBarang = jumlahBarang;
    }

    public String getNomorFaktur() {
        return nomorFaktur;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public Barang getBarang() {
        return barang;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    @Override
    public double hitungTotalPembayaran(double harga, int jumlah) {
        return harga * jumlah;
    }
}
