package modul3;

public class MainLingkaran {
    public static void main(String[] args) {
        // No 1 (Before)
        // lingkaran satu = new lingkaran(3);
        // 1.setTinggi(10);
        // 1.displayMessage();
        // lingkaran 12 = new lingkaran(4,10);
        // l2.displayMessage();
        // No. 1 (after)
      
        Lingkaran satu = new Lingkaran(3);
        satu.setTinggi(10);
        satu.displayMessage();
        Lingkaran duaBelas = new Lingkaran(4,10);
        duaBelas.displayMessage();

        Lingkaran Lstring = new Lingkaran("10","20");
        System.out.println(Lstring.hitungLuas());
    }
}
