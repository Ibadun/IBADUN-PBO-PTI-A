package praktikum;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Manusia manusia = new Manusia("John Doe", true, "1234567890", true);
        System.out.println("Data Manusia:");
        System.out.println(manusia);

        MahasiswaFILKOM mahasiswa = new MahasiswaFILKOM("Jane Smith", false, "0987654321", false, "1711502000", 3.75);
        System.out.println("\nData Mahasiswa FILKOM:");
        System.out.println(mahasiswa);

        Pekerja pekerja = new Pekerja("Alice Johnson", true, "2345678901", true, 50000, LocalDate.of(2015, 7, 15), 2);
        System.out.println("\nData Pekerja:");
        System.out.println(pekerja);

        Manager manager = new Manager("Bob Brown", true, "3456789012", true, 80000, LocalDate.of(2010, 3, 20), 3, "IT");
        System.out.println("\nData Manager:");
        System.out.println(manager);
    }
}
