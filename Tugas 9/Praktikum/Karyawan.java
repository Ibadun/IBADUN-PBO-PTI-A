package praktikum;

public class Karyawan {
    private int id;
    private String nama;
    private int gajiPerBulanan;
    private Invoice[] invoices;

    public Karyawan(int id, String nama, int gajiPerBulanan, Invoice[] invoices) {
        this.id = id;
        this.nama = nama;
        this.gajiPerBulanan= gajiPerBulanan;
        this.invoices = invoices;
    }

    public void displayEmployeeDetails() {
        System.out.println("ID Karyawan     : " + id);
        System.out.println("Nama Karyawan   : " + nama);
        System.out.println("Gaji perbulan   : " + gajiPerBulanan);
        System.out.println("Invoices      :");
        for (Invoice invoice : invoices) {
            invoice.displayInvoiceDetails();
        }
    }
}
