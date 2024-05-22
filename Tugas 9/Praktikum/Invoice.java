package praktikum;

public class Invoice {
    private String namaProduk;
    private int jumlah;
    private int harga;

    public Invoice(String namaproduk, int jumlah, int harga) {
        this.namaProduk = namaproduk;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public String getItemName() {
        return namaProduk;
    }

    public int getQuantity() {
        return jumlah;
    }

    public int getPrice() {
        return harga;
    }

    public int getTotal() {
        return jumlah * harga;
    }

    public void displayInvoiceDetails() {
        System.out.println("Item: " + namaProduk + ", Quantity: " + jumlah + ", Price: " + harga + ", Total: " + getTotal());
    }
}
