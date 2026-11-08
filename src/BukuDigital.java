public class BukuDigital extends Buku {
    private double ukuranMB;

    public BukuDigital(String judul, String penulis, int harga, double ukuranMB) {
        super(judul, penulis, harga);
        this.ukuranMB = ukuranMB;
    }

    @Override
    public int hargaAkhir() {
        return super.hargaAkhir() * 80 / 100;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.printf("  %-11s : %s MB%n", "Ukuran", ukuranMB);
        System.out.printf("  %-11s : %s (diskon 20%%)%n", "Harga akhir", formatRupiah(hargaAkhir()));
    }
}