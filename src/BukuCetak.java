public class BukuCetak extends Buku {
    private int beratGram;

    public BukuCetak(String judul, String penulis, int harga, int beratGram) {
        super(judul, penulis, harga);
        this.beratGram = beratGram;
    }

    public int hitungOngkir() {
        int kelipatan500 = (beratGram + 499) / 500; // pembulatan ke atas
        return kelipatan500 * 5000;
    }

    @Override
    public int hargaAkhir() {
        return super.hargaAkhir() + hitungOngkir();
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.printf("  %-11s : %d gram%n", "Berat", beratGram);
        System.out.printf("  %-11s : %s%n", "Ongkir", formatRupiah(hitungOngkir()));
        System.out.printf("  %-11s : %s%n", "Harga akhir", formatRupiah(hargaAkhir()));
    }
}