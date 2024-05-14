package bonus;

public class Dosen extends Civitas implements Pengajar {
    private String nip;
    private double gaji;

    public void ikutPenelitian() {
        System.out.println(nama + " ikut penelitian");
    }

    @Override
    public void mengajar(String matkul) {
        System.out.println(nama + " mengajar mata kuliah " + matkul);
    }

    @Override
    public void mengasihTugas() {
        System.out.println(nama + " memberikan tugas");
    }

    @Override
    public void menilaiTugas() {
        System.out.println(nama + " menilai tugas");
    }
}