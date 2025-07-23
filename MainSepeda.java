// Class utama (Main Program)
public class MainSepeda {
    public static void main(String[] args) {
        // Membuat objek sepeda
        sepeda sepeda1 = new sepeda();

        // Mengisi atribut
        sepeda1.warna = "Merah";
        sepeda1.jumlahRoda = 2;
        sepeda1.merk = "Polygon";

        // Menampilkan atribut
        System.out.println("Merk: " + sepeda1.merk);
        System.out.println("Warna: " + sepeda1.warna);
        System.out.println("Jumlah Roda: " + sepeda1.jumlahRoda);

        // Memanggil metode
        sepeda1.mengayuh();
        sepeda1.mengerem();
        sepeda1.membelok();
    }
}
