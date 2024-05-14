package bonus;

public class Asprak extends Mahasiswa implements Pengajar {
    public void ngasihKomenDiGCR() {
        System.out.println(nama + " ngasih komen di GCR");
    }

    @Override
    public void mengajar(String matkul) {
        System.out.println(nama + " mengajar mata kuliah " + matkul + " sebagai asisten praktikum");
    }

    @Override
    public void mengasihTugas() {
        System.out.println(nama + " memberikan tugas sebagai asisten praktikum");
    }

    @Override
    public void menilaiTugas() {
        System.out.println(nama + " menilai tugas sebagai asisten praktikum");
    }
}
