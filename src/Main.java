import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nama:");
        String nama = scanner.nextLine();

        System.out.println("Masukkan jenis kelamin (P/L):");
        char jenisKelamin = scanner.next().charAt(0);
        String jenisKelaminStr = (jenisKelamin == 'L') ? "laki-laki" : "perempuan";

        System.out.println("Masukkan tanggal lahir (YYYY-MM-DD):");
        String tanggalLahirStr = scanner.next();

        // Parsing tanggal lahir menjadi objek LocalDate
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirStr);

        // Mendapatkan tanggal sekarang
        LocalDate tanggalSekarang = LocalDate.now();

        // Menghitung umur
        Period period = Period.between(tanggalLahir, tanggalSekarang);
        int umur = period.getYears();

        System.out.println("\n===== Data Diri =====");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminStr);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Umur: " + umur + " tahun");

        scanner.close();
    }
}
