package praktikum;

public class Main {
    public static void main(String[] args) {
        Kue[] arrayKue = new Kue[20];

        arrayKue[0] = new KuePesanan("Apem", 2000, 0.5);
        arrayKue[1] = new KuePesanan("Bika Ambon", 65000, 0.8);
        arrayKue[2] = new KuePesanan("Bolu Kukus", 25000, 0.5);
        arrayKue[3] = new KuePesanan("Kue Cucur", 2500, 0.5);
        arrayKue[4] = new KuePesanan("Kue Cubit", 25000, 0.8);
        arrayKue[5] = new KuePesanan("Lapis Legit", 50000, 0.8);
        arrayKue[6] = new KuePesanan("Kue Lumpur", 2500, 0.5);
        arrayKue[7] = new KuePesanan("Pukis", 2500, 0.5);
        arrayKue[8] = new KuePesanan("Kue Pancong", 2500, 0.5);
        arrayKue[9] = new KuePesanan("Kue Sus", 2500, 0.5);

        arrayKue[10] = new KueJadi("Donat", 2000, 5);
        arrayKue[11] = new KueJadi("Brownis", 5000, 10);
        arrayKue[12] = new KueJadi("Lidah Kucing", 35000, 5);
        arrayKue[13] = new KueJadi("Dessert", 15000, 8);
        arrayKue[14] = new KueJadi("Kue Kering 1", 8000, 12);
        arrayKue[15] = new KueJadi("Kue Kering 2", 8000, 12);
        arrayKue[16] = new KueJadi("Kue Kering 3", 8000, 12);
        arrayKue[17] = new KueJadi("Kue Kering 4", 8000, 12);
        arrayKue[18] = new KueJadi("Kue Kering 5", 8000, 12);
        arrayKue[19] = new KueJadi("Kue Kering 6", 8000, 12);

        // semua kue
        System.out.println();
        System.out.println("Daftar Semua Kue:");
        for (Kue kue : arrayKue) {
            System.out.println(kue);
        }

        // total harga semua kue
        System.out.println();
        double totalHargaSemuaKue = 0;
        for (Kue kue : arrayKue) {
            totalHargaSemuaKue += kue.hitungHarga();
        }
        System.out.println("Total Harga Semua Kue: " + totalHargaSemuaKue);

        // total harga, total berat KuePesanan
        System.out.println();
        double totalHargaKuePesanan = 0;
        double totalBeratKuePesanan = 0;
        for (Kue kue : arrayKue) {
            if (kue instanceof KuePesanan) {
                totalHargaKuePesanan += kue.hitungHarga();
                totalBeratKuePesanan += ((KuePesanan) kue).getBerat();
            }
        }
        System.out.println("Total Harga Kue Pesanan: " + totalHargaKuePesanan);
        System.out.println("Total Berat Kue Pesanan: " + totalBeratKuePesanan);

        // total harga, total jumlah KueJadi
        System.out.println();
        double totalHargaKueJadi = 0;
        double totalJumlahKueJadi = 0;
        for (Kue kue : arrayKue) {
            if (kue instanceof KueJadi) {
                totalHargaKueJadi += kue.hitungHarga();
                totalJumlahKueJadi += ((KueJadi) kue).getJumlah();
            }
        }
        System.out.println("Total Harga Kue Jadi: " + totalHargaKueJadi);
        System.out.println("Total Jumlah Kue Jadi: " + totalJumlahKueJadi);

        // kue harga akhir terbesar
        System.out.println();
        double hargaTerbesar = 0;
        Kue kueTerbesar = null;
        for (Kue kue : arrayKue) {
            if (kue.hitungHarga() > hargaTerbesar) {
                hargaTerbesar = kue.hitungHarga();
                kueTerbesar = kue;
            }
        }
        System.out.println("Kue dengan Harga Terbesar:\n" + kueTerbesar);
    }
}