// Class utama (Main Program)
public class MainMahasiswa {
    public static void main(String[] args) {
        // Membuat objek mahasiswa
        Mahasiswa mhs1 = new Mahasiswa();

        // Mengisi atribut
        mhs1.nama = "Rina";
        mhs1.nim = "23105001";
        mhs1.jurusan = "Sistem Informasi";

        // Menampilkan informasi
        System.out.println("Nama: " + mhs1.nama);
        System.out.println("NIM: " + mhs1.nim);
        System.out.println("Jurusan: " + mhs1.jurusan);

        // Memanggil metode
        mhs1.belajar();
        mhs1.mengerjakanTugas();
        mhs1.mengikutiUjian();
    }
}
