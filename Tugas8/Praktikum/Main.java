package praktikum;

public class Main {
    public static void main(String[] args) {
        //PegawaiTetap
        PegawaiTetap pegawaiTetap1 = new PegawaiTetap("Bayu", "350728490327424082344", 2000000);
        PegawaiTetap pegawaiTetap2 = new PegawaiTetap("Rina", "350728490327424082345", 2500000);
        PegawaiTetap pegawaiTetap3 = new PegawaiTetap("Sinta", "350728490327424082346", 3000000);

        //PegawaiHarian
        PegawaiHarian pegawaiHarian1 = new PegawaiHarian("Edo", "350728490327424082347", 8500, 40);
        PegawaiHarian pegawaiHarian2 = new PegawaiHarian("Budi", "350728490327424082348", 9000, 45);
        PegawaiHarian pegawaiHarian3 = new PegawaiHarian("Ani", "350728490327424082349", 8000, 38);

        // Sales
        Sales sales1 = new Sales("Tika", "350728490327424082350", 50, 50000);
        Sales sales2 = new Sales("Doni", "350728490327424082351", 60, 55000);
        Sales sales3 = new Sales("Susi", "350728490327424082352", 70, 60000);

        // Polymorphism
        Pegawai[] pegawai = new Pegawai[9];
        pegawai[0] = pegawaiTetap1;
        pegawai[1] = pegawaiTetap2;
        pegawai[2] = pegawaiTetap3;
        pegawai[3] = pegawaiHarian1;
        pegawai[4] = pegawaiHarian2;
        pegawai[5] = pegawaiHarian3;
        pegawai[6] = sales1;
        pegawai[7] = sales2;
        pegawai[8] = sales3;

        for (Pegawai p : pegawai) {
            System.out.println(p);
            System.out.println();
        }

        // Upcasting and downcasting 
        Pegawai pegawaiUpcast = new PegawaiTetap("Anton", "350728490327424082353", 3500000);
        if (pegawaiUpcast instanceof PegawaiTetap) {
            PegawaiTetap pegawaiDowncast = (PegawaiTetap) pegawaiUpcast;
            System.out.println("Downcasting successful:");
            System.out.println(pegawaiDowncast);
        }
    }
}
