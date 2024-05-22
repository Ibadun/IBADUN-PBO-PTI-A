package analisis;

import java.util.Scanner;

// 1. Tidak ada kesalahan
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // No.2
        // MakhlukHidup manusia = new MakhlukHidup();

        // No. 6
        Manusia manusia = new Manusia("Ibadun", 19);

        // No.7
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan umur: ");
        int umur = scanner.nextInt();

        // No.8
        MakhlukHidup kuda = new Hewan();
        kuda.bersuara();
        kuda.makan();

        manusia.makan();
        manusia.berjalan();
        manusia.bersuara();
        manusia.tampilkanNama();
        manusia.tampilkanUmur();
    }
}