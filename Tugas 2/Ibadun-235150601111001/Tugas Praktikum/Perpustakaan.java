import java.util.*;

class Buku {
    String judul;
    List<String> penulis;

    Buku(String judul, List<String> penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }
}

public class Perpustakaan {
    public static void main(String[] args) {
        Map<String, List<Buku>> koleksiBuku = new HashMap<>();
        koleksiBuku.put("Teknologi", Arrays.asList(
            new Buku("Dasar-Dasar Teknik Informatika", Arrays.asList("Novega Pratama Adiputra")),
            new Buku("Pengantar Teknologi Informasi", Arrays.asList("Buhori Muslim")),
            new Buku("Aplikasi Komputer", Arrays.asList("Dwi Krisbiantoro, M.Kom.")),
            new Buku("Introduction to Algorithms", Arrays.asList("Thomas H. Cormen")),
            new Buku("Teknologi Pendidikan", Arrays.asList("Prof. Dr. Nasution, M.A."))
        ));

        koleksiBuku.put("Psikologi", Arrays.asList(
            new Buku("The Power of Habit", Arrays.asList("Charles Duhigg")),
            new Buku("Thinking Fast & Slow", Arrays.asList("Daniel Kahneman")),
            new Buku("The Art of Choosing", Arrays.asList("Sheena Iyengar")),
            new Buku("Atomic Habits", Arrays.asList("James Clear")),
            new Buku("Filosofi Air", Arrays.asList("Dedi Mahardi"))
        ));

        for (String kategori : koleksiBuku.keySet()) {
            System.out.println("Kategori: " + kategori);
            for (Buku buku : koleksiBuku.get(kategori)) {
                System.out.println("Judul: " + buku.judul);
                System.out.println("Penulis: " + String.join(", ", buku.penulis));
                System.out.println();
            }
            System.out.println();
        }
    }
}
