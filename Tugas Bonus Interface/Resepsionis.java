package bonus;

public class Resepsionis extends Civitas {
    private int idResepsionis;
    private String jabatan;
    private double gaji;

    public void melayani() {
        System.out.println(nama + " melayani tamu");
    }

    public void melapor() {
        System.out.println(nama + " melapor");
    }
}