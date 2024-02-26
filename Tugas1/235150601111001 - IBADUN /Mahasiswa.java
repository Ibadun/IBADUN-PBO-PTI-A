import java.util.Scanner;

public class Mahasiswa {
    static Scanner scanner = new Scanner(System.in);
    static String[] mataKuliah = {"Manajamen Pembelajaran", "Statistika Dasar", "Matematika Komputasi"};
    static String[][] jadwalKuliah = {
            {"Manajemen Pembelajaran", "Rabu", "07.00 - 08.40"},
            {"Statistika Dasar", "Rabu", "12.50 - 14.10"},
            {"Matematika Komputasi", "Kamis", "09.30 - 11.10"}
    };
    static double[] nilaiMahasiswa = new double[mataKuliah.length];

    public static void main(String[] args) {
        System.out.println("Selamat datang di SIAM");

        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Daftar Mata Kuliah");
            System.out.println("2. Jadwal Kuliah");
            System.out.println("3. Cek Nilai");
            System.out.println("4. Keluar");

            System.out.print("Pilih menu (1-4): ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    DaftarMataKuliah();
                    break;
                case 2:
                    JadwalKuliah();
                    break;
                case 3:
                    CekNilai();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan SIAM !");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silahkan ulangi kembali proses anda.");
            }
        } while (pilihan != 4);
    }

    static void DaftarMataKuliah() {
        System.out.println("\nDaftar Mata Kuliah");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println((i + 1) + ". " + mataKuliah[i]);
        }

        System.out.print("Pilih mata kuliah (1-" + mataKuliah.length + "): ");
        int indexMataKuliah = scanner.nextInt() - 1;

        if (indexMataKuliah >= 0 && indexMataKuliah < mataKuliah.length) {
            System.out.println("Anda telah mendaftar untuk mata kuliah ini");
        } else {
            System.out.println("Pilihan anda tidak valid.");
        }
    }

    static void JadwalKuliah() {
        System.out.println("\nJadwal Mata Kuliah");
        for (String[] jadwal : jadwalKuliah) {
            System.out.println("Mata Kuliah : " + jadwal[0]);
            System.out.println("Hari        : " + jadwal[1]);
            System.out.println("Jam         : " + jadwal[2]);
            System.out.println();
        }
    }

    static void CekNilai() {
        System.out.println("\nCek Nilai");

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai mata kuliah " + mataKuliah[i] + ": ");
            nilaiMahasiswa[i] = scanner.nextDouble();
        }

        System.out.println("\nNilai Mahasiswa");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.println(mataKuliah[i] + ": " + nilaiMahasiswa[i]);
        }
    }
}
