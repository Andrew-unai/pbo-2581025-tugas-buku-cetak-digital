public class TokoBuku {
    public static void main(String[] args) {

//Percobaan menghapus super(...) di constructor BukuDigital
//java: constructor Buku in class Buku cannot be applied to given types;
//  required: java.lang.String,java.lang.String,int
//  found:    no arguments
//  reason: actual and formal argument lists differ in length

        Buku[] keranjang = {
                new BukuCetak("Pemrograman Java", "John Doe", 120000, 750),
                new BukuCetak("Algoritma Dasar", "Jane Smith", 95000, 400),
                new BukuDigital("Belajar OOP", "Ani Wijaya", 80000, 12.5)
        };

        System.out.println("=============== KERANJANG ===============");
        int total = 0;
        for (Buku b : keranjang) {
            b.tampilkanInfo();
            total += b.hargaAkhir();
        }
        System.out.println("-----------------------------------------");
        System.out.printf("%-11s   : %s%n", "Total bayar", Buku.formatRupiah(total));
    }
}