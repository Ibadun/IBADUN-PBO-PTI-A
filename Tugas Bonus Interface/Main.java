package bonus;

public class Main {
    public static void main(String[] args) {
        Civitas civitas = new Civitas();
        civitas.nama = "Civitas Umum";
        civitas.umur = 30;
        civitas.jenisKelamin = true;

        Dosen dosen = new Dosen();
        dosen.nama = "Pak Galih";
        dosen.umur = 45;
        dosen.jenisKelamin = true;

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.nama = "Reza";
        mahasiswa.umur = 20;
        mahasiswa.jenisKelamin = false;

        Resepsionis resepsionis = new Resepsionis();
        resepsionis.nama = "Yuan";
        resepsionis.umur = 35;
        resepsionis.jenisKelamin = true;

        Asprak asprak = new Asprak();
        asprak.nama = "Dhani";
        asprak.umur = 22;
        asprak.jenisKelamin = true;

        // upcasting
        Civitas upcastedDosen = dosen;
        Civitas upcastedMahasiswa = mahasiswa;
        Civitas upcastedResepsionis = resepsionis;

        Pengajar upcastedPengajar = dosen;
        Pengajar upcastedAsprak = asprak;

        PesertaKelas upcastedPesertaKelas = mahasiswa;

        upcastedDosen.naikLift();
        upcastedMahasiswa.makanDiKantin("GKM");
        upcastedResepsionis.mainGameCorner();

        upcastedPengajar.mengajar("PBO");
        upcastedAsprak.mengasihTugas();

        upcastedPesertaKelas.masukKelas();
    }
}
