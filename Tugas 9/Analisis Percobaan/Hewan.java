package analisis;

public class Hewan implements MakhlukHidup, Identitas {
 @Override
 public void makan() {
 System.out.println("Makan pakai tangan dan mulut");
 }
 @Override
 public void berjalan() {
 System.out.println("Jalan pakai 4 kaki");
 }
 @Override
 public void bersuara() {
 System.out.println("Suaranya nggak jelas");
 }

 public void tampilkanNama (){}

 public void tampilkanUmur () {}
}

// No.5
// Jika pada kelas Hewan hanya mengimplementasikan interface MakhlukHidup saja, maka kelas Hewan 
// hanya akan memiliki akses ke metode yang didefinisikan dalam interface MakhlukHidup. Ini berarti 
// hanya metode makan(), berjalan(), dan bersuara() yang akan tersedia dalam kelas Hewan.
// Metode tampilkanNama() dan tampilkanUmur() yang didefinisikan dalam kelas Hewan tidak akan terpengaruh 
// karena kedua metode tersebut tidak terkait dengan interface MakhlukHidup. Dengan kata lain, jika hanya 
// mengimplementasikan MakhlukHidup, kelas Hewan tidak akan memiliki metode tampilkanNama() dan tampilkanUmur().
