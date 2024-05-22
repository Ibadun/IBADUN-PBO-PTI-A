package praktikum;

public class Main {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("Laptop", 1, 10000000);
        Invoice invoice2 = new Invoice("Mouse", 2, 50000);
        Invoice invoice3 = new Invoice("Keyboard", 1, 300000);

        Invoice[] invoices = {invoice1, invoice2, invoice3};

        Karyawan employee = new Karyawan(123456, "Ibadun", 15000000, invoices);

        employee.displayEmployeeDetails();
    }
}
