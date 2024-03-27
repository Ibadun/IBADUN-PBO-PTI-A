package Praktikum;

import java.util.Scanner;

class Pelanggan {
    private String nomorPelanggan;
    private String nama;
    private double saldo;
    private int pin;
    private int percobaanAutentikasi;

    // ConstruCtor
    public Pelanggan(String nomorPelanggan, String nama, double saldo, int pin) {
        this.nomorPelanggan = nomorPelanggan;
        this.nama = nama;
        this.saldo = saldo;
        this.pin = pin;
        this.percobaanAutentikasi = 0;
    }

    // Method getter
    public String getNomorPelanggan() {
        return nomorPelanggan;
    }
    public String getNama() {
        return nama;
    }
    public double getSaldo() {
        return saldo;
    }

    // Method untuk melakukan transaksi pembelian
    public boolean beli(double jumlah) {
        if (jumlah > saldo) {
            System.out.println("Transaksi gagal: Saldo tidak mencukupi");
            return false;
        }
    // Memeriksa apakah saldo setelah transaksi memenuhi persyaratan saldo minimum
        double sisaSaldo = saldo - jumlah;
        if (sisaSaldo < 10000) {
            System.out.println("Transaksi gagal: Saldo tidak memenuhi saldo minimal");
            return false;
        }

    // Memberikan cashback berdasarkan jenis pelanggan
        double cashback = 0.0;
        // Pelanggan jenis silver "38", pelanggan jenis gold "56", pelanggan jenis platinum "74"
        if (nomorPelanggan.startsWith("38") && jumlah > 1000000) {
            cashback = jumlah * 0.05;
        } else if (nomorPelanggan.startsWith("56") && jumlah > 1000000) {
            cashback = jumlah * 0.07;
        } else if (nomorPelanggan.startsWith("74") && jumlah > 1000000) {
            cashback = jumlah * 0.10;
        } else {
            cashback = jumlah * 0.02;
        }

    // Melakukan transaksi
        saldo = sisaSaldo + cashback;
        System.out.println("Transaksi berhasil. Cashback yang diterima : " + cashback);
        return true;
    }

    // Method untuk melakukan top-up
    public void topUp(double jumlah) {
        saldo += jumlah;
        System.out.println("Top-up berhasil. Saldo baru : " + saldo);
    }

    // Method untuk mengautentikasi pelanggan
    public boolean autentikasi(int pinInput) {
        if (pinInput == pin) {
            percobaanAutentikasi = 0; // Reset percobaan autentikasi saat autentikasi berhasil
            return true;
        } else {
            percobaanAutentikasi++;
            System.out.println("PIN salah. Percobaan tersisa: " + (3 - percobaanAutentikasi) + " kali");
            if (percobaanAutentikasi >= 3) {
                System.out.println("Terlalu banyak percobaan autentikasi. Akun anda telah diblokir");
            }
            return false;
        }
    }

    // Method setter untuk saldo 
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

public class AkunTransaksi {
    public static void main(String[] args) {
        // Membuat objek pelanggan
        Pelanggan pelanggan1 = new Pelanggan("3812345678", "Lathifah", 1500000, 1234);
        Pelanggan pelanggan2 = new Pelanggan("5612345678", "Naylah", 2000000, 5678);
        Pelanggan pelanggan3 = new Pelanggan("7412345678", "Vaness", 3000000, 91011);

        // Melakukan transaksi
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nomor pelanggan :");
        String nomorPelanggan = sc.nextLine();
        System.out.println("Masukkan PIN :");
        int pin = sc.nextInt();
        System.out.println("Masukkan jumlah transaksi :");
        double jumlah = sc.nextDouble();

        // Memilih jenis transaksi
        System.out.println("Ketik 1 untuk pembelian atau ketik 0 untuk top-up :");
        int jenisTransaksi = sc.nextInt();
        boolean pembelian = jenisTransaksi == 1;

        // Memeriksa nomor pelanggan dan melakukan transaksi
        if (nomorPelanggan.equals(pelanggan1.getNomorPelanggan())) {
            lakukanTransaksi(pelanggan1, pin, jumlah, pembelian);
        } else if (nomorPelanggan.equals(pelanggan2.getNomorPelanggan())) {
            lakukanTransaksi(pelanggan2, pin, jumlah, pembelian);
        } else if (nomorPelanggan.equals(pelanggan3.getNomorPelanggan())) {
            lakukanTransaksi(pelanggan3, pin, jumlah, pembelian);
        } else {
            System.out.println("Pelanggan tidak ditemukan");
        }
    }

    // Method untuk melakukan transaksi
    public static void lakukanTransaksi(Pelanggan pelanggan, int pin, double jumlah, boolean pembelian) {
        if (pelanggan.autentikasi(pin)) {
            if (pembelian) {
                pelanggan.beli(jumlah);
            } else {
                pelanggan.topUp(jumlah);
            }
        }
    }
}
