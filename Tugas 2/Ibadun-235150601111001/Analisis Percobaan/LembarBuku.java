import java.util.Scanner;

public class LembarBuku {
    private int JumlahLembarBuku;
    private int KataPerHari;

    public LembarBuku(int jumlahLembarBuku, int kataPerHari) {
        this.JumlahLembarBuku = jumlahLembarBuku;
        this.KataPerHari = kataPerHari;
    }

    public int jmlHariYangDihabiskan() {
        int totalKata = JumlahLembarBuku * 100 * 2; 
        int hari = totalKata / KataPerHari; 
        return hari;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Jumlah Lembar Buku : ");
        int JumlahLembar = input.nextInt();
        System.out.println("Kata Per Hari : ");
        int KataPerHari = input.nextInt();
        int HasilKataPerHari = KataPerHari / 2; 
        
        LembarBuku buku = new LembarBuku(JumlahLembar, HasilKataPerHari);
        int hariMenghabiskan = buku.jmlHariYangDihabiskan();
        
        System.out.println("Mahasiswa A akan menghabiskan buku tulis tersebut dalam waktu " + hariMenghabiskan + " hari");
    }
}
