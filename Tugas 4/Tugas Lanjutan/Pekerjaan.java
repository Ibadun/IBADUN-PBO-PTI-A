package tugaslanjutan;

import java.util.Scanner;

public class Pekerjaan {
    private int id;
    private String nama;
    private String deskripsi;
    private float gaji;

    // Constructors
    public Pekerjaan() {}

    public Pekerjaan(int id) {
        this.id = id;
    }

    public Pekerjaan(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public Pekerjaan(int id, String nama, String deskripsi, float gaji) {
        this.id = id;
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.gaji = gaji;
    }

    // Getter and Setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public float getGaji() {
        return gaji;
    }

    public void setGaji(float gaji) {
        this.gaji = gaji;
    }

    // Method Overloads
    public void printInfo() {
        System.out.println("Nama Pekerjaan      : " + nama);
        System.out.println("Deskripsi Pekerjaan : " + deskripsi);
        System.out.println("Gaji                : " + gaji);
    }

    public void printInfo(String additionalInfo) {
        System.out.println("Nama Pekerjaan      : " + nama);
        System.out.println("Deskripsi Pekerjaan : " + deskripsi);
        System.out.println("Gaji                : " + gaji);
        System.out.println("Info Tambahan       : " + additionalInfo);
    }

    public void printInfo(int id, String nama) {
        System.out.println("ID Pekerjaan        : " + id);
        System.out.println("Nama Pekerjaan      : " + nama);
        System.out.println("Deskripsi Pekerjaan : " + deskripsi);
        System.out.println("Gaji                : " + gaji);
    }

    // Method untuk mengembalikan tipe data class itu sendiri
    public Pekerjaan getInstance() {
        return this;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan informasi pekerjaan :");
        System.out.print("ID                           : ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Nama                         : ");
        String nama = scanner.nextLine();
        System.out.print("Deskripsi                    : ");
        String deskripsi = scanner.nextLine();
        System.out.print("Gaji                         : ");
        float gaji = scanner.nextFloat();

        // Membuat objek menggunakan constructor overloading
        Pekerjaan pekerjaan = new Pekerjaan(id, nama, deskripsi, gaji);

        // Memanggil method overloading
        pekerjaan.printInfo();
        pekerjaan.printInfo(id, nama);
        pekerjaan.printInfo("Jumlah Jam Kerja: 40 jam/minggu");
        scanner.close();
    }
}
